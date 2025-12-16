import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        String busca;
        String endereco;


        while (escolha != 2) {

            System.out.println("""
                    ----------------------------------------
                    Boas vindas ao caça CEP!
                    
                    MENU DE OPÇÕES
                    
                     1 - Consultar CEP
                     2 - Sair
                    
                    Digite o número da opção desejada:
                    ----------------------------------------
                    """);

            escolha = input.nextInt();
            input.nextLine(); //evitando que ele pegue o enter do scanner e pule o cep

            if (escolha == 1) {

                System.out.println("""
                        Digite o cep que deseja consultar (apenas números):
                        """);

                busca = input.nextLine();

                if (busca.length() != 8) {
                    System.out.println("CEP inválido. Lembre-se: o CEP deve conter 8 dígitos");
                    continue;
                }

                try {

                    endereco = "https://viacep.com.br/ws/" + busca + "/json/";
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(endereco))
                            .build();
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();

                    Gson gson = new GsonBuilder()
                            .setPrettyPrinting()
                            .create();

                    if (json.contains("\"erro\": true")) { //verificando se a API retornou algo válido
                        System.out.println("CEP não encontrado!");
                        continue;
                    }

                    Endereco endereco1 = gson.fromJson(json, Endereco.class);//transformo o json no meu objeto

                    System.out.println("""
                            
                            O endereço encontrado foi:
                            
                            """ + endereco1); // imprimo o toString personalizado com as infos que vieram no json

                    FileWriter escrita = new FileWriter("endereco_" + busca + ".json"); //criando o arquivo com o resultado da busca
                    escrita.write(gson.toJson(endereco1));
                    escrita.close();


                } catch (IllegalArgumentException e) {
                    System.out.println("Erro de formato: O CEP digitado contém caracteres inválidos na URL.");

                } catch (IOException | InterruptedException e) {
                    System.out.println("Erro de conexão. Verifique sua internet.");

                } catch (JsonSyntaxException e) {
                    System.out.println("Erro de leitura.");

                }

            }else if (escolha == 2) {
                System.out.println("Programa encerrado com sucesso!");

            } else {
                System.out.println("Escolha inválida!");
                continue;
            }

            }
        }
    }