import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        String endereco = "";
        int escolha = 0;
        String de = "";
        String para = "";
        double valorParaConversao = 0;

        while (escolha != 11) {

            System.out.println("""
                     ----------------------------------------
                        Boas vindas ao conversor de moedas!
                    
                        MENU DE OPÇÕES
                    
                         1) Dólar =>> Peso argentino
                         2) Peso argentino =>> Dólar
                         3) Dólar =>> Real brasileiro
                         4) Real brasileiro =>> Dólar
                         5) Dólar =>> Peso colombiano
                         6) Peso colombiano =>> Dólar
                         7) Dólar =>> Peso chileno (CLP)
                         8) Peso chileno =>> Dólar
                         9) Dólar =>> Boliviano (BOB)
                         10) Boliviano =>> Dólar
                         11) Sair
                    
                        Digite o número da opção desejada:
                        ----------------------------------------
                    """);

            try {
                escolha = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Caractere inválido. Por favor, digite apenas números inteiros.");
                input.nextLine();
                continue;
            }

            if(escolha == 11){
                System.out.println("Programa encerrado!");
                break;
            }



            switch (escolha) {
                case 1 -> { de = "USD"; para = "ARS"; }
                case 2 -> { de = "ARS"; para = "USD"; }
                case 3 -> { de = "USD"; para = "BRL"; }
                case 4 -> { de = "BRL"; para = "USD"; }
                case 5 -> { de = "USD"; para = "COP"; }
                case 6 -> { de = "COP"; para = "USD"; }
                case 7 -> { de = "USD"; para = "CLP"; }
                case 8 -> { de = "CLP"; para = "USD"; }
                case 9 -> { de = "USD"; para = "BOB"; }
                case 10 -> { de = "BOB"; para = "USD"; }
                default -> {
                    System.out.println("Opção inválida!");
                    continue; //
                }
            }

            System.out.println("Agora digite o valor que deseja converter: ");

            try {
                valorParaConversao = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite apenas números.");
                input.nextLine();
                continue;
            }


            try {
                endereco = "https://v6.exchangerate-api.com/v6/9f114d14e06339b5522b4806/pair/" + de + "/" + para;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();

                Gson gson = new Gson();

                Conversao novaConversao = gson.fromJson(json, Conversao.class);
                double taxa = novaConversao.conversion_rate();
                double resultado = valorParaConversao * taxa;

                System.out.println(String.format("""
                        Aqui está sua conversão:
                        
                        %.2f %s hoje equivalem a %.2f %s
                        
                        """, valorParaConversao, de, resultado, para));


            } catch (IOException | InterruptedException e) {
                System.out.println("Não foi possível acessar o servidor. Verifique sua internet.");

            } catch (JsonSyntaxException e) {
                System.out.println("O servidor retornou um formato inesperado.");

            } catch (RuntimeException e) {
                System.out.println("Houve o seguinte erro: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Houve o seguinte erro: " + e.getMessage());
            }

            }
        }
    }

