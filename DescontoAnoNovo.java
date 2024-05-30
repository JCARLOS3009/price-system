// DescontoAnoNovo.java
public class DescontoAnoNovo implements Strategy {
    @Override
    public double calcularPreco(double precoOriginal) {
        return precoOriginal * 0.8; // 20% de desconto
    }
}
