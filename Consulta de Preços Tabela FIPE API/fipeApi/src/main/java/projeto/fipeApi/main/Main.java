package projeto.fipeApi.main;

import projeto.fipeApi.model.DadosModelos;
import projeto.fipeApi.model.DadosMarcas;
import projeto.fipeApi.model.DadosVeiculo;
import projeto.fipeApi.model.Modelos;
import projeto.fipeApi.services.ConsumoAPI;
import projeto.fipeApi.services.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    Scanner input = new Scanner(System.in);
    private final String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";
    private final String MARCAS = "/marcas/";
    private final String MODELOS = "/modelos/";
    private final String ANOS = "/anos/";

    private String tipoVeiculo;


    private ConsumoAPI consumoAPI = new ConsumoAPI();

    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu() {
        System.out.println("""
                Boas vindas ao buscador de preços FIPE!
                
                **************OPÇÕES**************
                
                1 - CARRO
                2 - CAMINHAO
                3 - MOTO 
                
                Digite, por favor, o número do tipo de veículo desejado:
                """);

        var escolhaTipoVeiculo = input.nextInt();

        if (escolhaTipoVeiculo == 1) {
            tipoVeiculo = "carros";
        }

        if (escolhaTipoVeiculo == 2) {
            tipoVeiculo = "caminhoes";
        }
        if (escolhaTipoVeiculo == 3) {
            tipoVeiculo = "motos";
        }

        var jsonMarcas = consumoAPI.obterDados(ENDERECO + tipoVeiculo + MARCAS);

        List<DadosMarcas> dadosTipo = conversor.obterLista(jsonMarcas, DadosMarcas.class);

        dadosTipo.stream()
                .forEach(System.out::println);

        System.out.println("""
                
                Dados os códigos acima, digite o código da marca desejada: 
                """);

        var escolhaMarca = input.nextInt();
        input.nextLine(); //Sempre que usar nextInt(), nextDouble(), e logo depois for usar um nextLine() para ler texto, obrigatoriamente precisa dar um nextLine() vazio no meio para "comer" o Enter que sobrou.

        var jsonModelos = consumoAPI.obterDados(ENDERECO + tipoVeiculo + MARCAS + escolhaMarca + MODELOS);

        var dadosModelos = conversor.obterDados(jsonModelos, Modelos.class); //chamando a classe intermediária para "desembalar a lista que vem como objeto nessa API

        List<DadosModelos> listaDeModelos = dadosModelos.modelos(); // finalmente criou uma lista com essa lista

        listaDeModelos.stream()
                .forEach(System.out::println);

        System.out.println("""
                
                Dada a lista de modelos acima, digite o modelo desejado: 
                """);

        var escolhaModelo = input.nextLine();

        List<DadosModelos> modeloBuscado = dadosModelos.modelos().stream()
                .filter(m -> m.descricao().toLowerCase().contains(escolhaModelo.toLowerCase()))
                .collect(Collectors.toList());


        System.out.println("Lista de veículos filtrados pela sua busca: ");
        modeloBuscado.stream()
                .forEach(System.out::println);

        System.out.println("""

                Agora digite o código do veículo que deseja consultar o valor:

                """); //a api não entrega esse dado, então tenho que fazer um loop pra criar essa lista

        var escolhaVeiculo = input.nextLine();

        var enderecoDadosFinais = ENDERECO + tipoVeiculo + MARCAS + escolhaMarca + MODELOS + escolhaVeiculo + ANOS; // colocando o endereço numa variável porque vou usar no loop

        var jsonAnos = consumoAPI.obterDados(enderecoDadosFinais);

        List<DadosModelos> listaPorAno = conversor.obterLista(jsonAnos, DadosModelos.class); // esse endereço com ano não devolve completo, então eu vou ter que fazer primeiro uma lista com dados parciais, pegar o código desses resultados e aí sim consultar já com o código pra obter os dados completos

        List<DadosVeiculo> veiculosComPreco = new ArrayList<>(); //lista para armazenar a lista final que vou ter que "minerar"

        for (int i = 0; i < listaPorAno.size(); i++) {
            var dadosAno = listaPorAno.get(i);

            var enderecoDados =  enderecoDadosFinais + "/" + dadosAno.codigo();

            var jsonVeiculo = consumoAPI.obterDados(enderecoDados);//json detalhado

            DadosVeiculo veiculo = conversor.obterDados(jsonVeiculo, DadosVeiculo.class); // criando objetos com os dados

            veiculosComPreco.add(veiculo); //
        }

        System.out.println("\n Aqui vão todos os veículos filtrados com avaliações por ano: ");
        veiculosComPreco.forEach(System.out::println);

    }
}