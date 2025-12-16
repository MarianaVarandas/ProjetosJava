public record Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {

    @Override
    public String toString() {
        return "cep: " + this.cep +
                ", logradouro: " + this.logradouro+
                ", complemento: " + this.complemento +
                ", bairro: " + this.bairro +
                ", localidade " + this.localidade +
                ", uf: " + this.uf;
    }
}
