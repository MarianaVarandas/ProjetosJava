public class Item implements Comparable<Item>{
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return this.getNome() + " R$" + this.getPreco();
    }

    @Override
    public int compareTo(Item outroItem) {
        return Double.compare(this.preco, outroItem.preco); //comparando os preços dos itens para ordenar a lista de itens
    }
}
