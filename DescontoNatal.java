// File name: `src/main/java/DescontoNatal.java`

public class DescontoNatal implements Strategy {
    @Override
    public double calcularPreco(double precoOriginal) {
        return precoOriginal * 0.9; // 10% de desconto
    }
}
