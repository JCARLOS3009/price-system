
// SemDesconto.java
public class SemDesconto implements Strategy {
    @Override
    public double calcularPreco(double precoOriginal) {
        return precoOriginal; // Sem desconto
    }
}
