public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(100.0); // Preço original

        // Aplicando desconto de Natal
        produto.setStrategy(new DescontoNatal());
        System.out.println("Preço com desconto de Natal: " + produto.calcularPreco());

        // Aplicando desconto de Ano Novo
        produto.setStrategy(new DescontoAnoNovo());
        System.out.println("Preço com desconto de Ano Novo: " + produto.calcularPreco());

        // Sem desconto
        produto.setStrategy(new SemDesconto());
        System.out.println("Preço sem desconto: " + produto.calcularPreco());
    }
}
