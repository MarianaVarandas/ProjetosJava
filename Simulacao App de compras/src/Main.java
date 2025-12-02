import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoCartao;
        int escolhaMenu = 0;
        String nomeItem;
        double valorCompra;


        ArrayList<Item> listaDeItens = new ArrayList<>();


        System.out.println("""
                Boas vindas ao seu Banco Digital!
                Digite o limite do seu cartão:
                """);
        saldoCartao = input.nextDouble();


        while (escolhaMenu != 3) {

        System.out.println("""
                ---------------------------------
                
                Escolha no menu abaixo a operação desejada:
                
                1 - Realizar uma nova compra
                2 - Checar limite disponível
                3 - Sair
                
                ---------------------------------
                """);
        escolhaMenu = input.nextInt();

        if (escolhaMenu == 1) {
            System.out.println("\nDigite o item que deseja comprar: ");
            nomeItem = input.next();

            System.out.println("\nDigite o valor da compra: ");
            valorCompra = input.nextDouble();

            if (valorCompra <= saldoCartao) {
                System.out.println("\nCompra realizada com sucesso!");

                Item item = new Item(nomeItem, valorCompra);
                listaDeItens.add(item);
                saldoCartao -= valorCompra;
            }else {
                System.out.println("\nSaldo insuficiente!");
                System.out.println(String.format("\nSeu limite atual é de: R$%.2f", saldoCartao));
                Collections.sort(listaDeItens);
                System.out.println("\nAqui está a sua fatura: ");
                for (Item item : listaDeItens) {
                    System.out.println(item);
                }
            }

        } else if (escolhaMenu == 2) {
            System.out.println(String.format("\nSeu limite atual é de: R$%.2f", saldoCartao));

        } else {
            Collections.sort(listaDeItens);
            System.out.println("Aqui está sua fatura: \n");
            for(Item item:listaDeItens){
                System.out.println(item);
            }
            System.out.println(String.format("\nSeu limite atual é de: R$%.2f", saldoCartao));
            break;
        }
    }

}
}
