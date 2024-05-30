// Produto.java
public class Produto {
    private double precoOriginal;
    private Strategy strategy;

    public Produto(double precoOriginal) {
        this.precoOriginal = precoOriginal;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calcularPreco() {
        return strategy.calcularPreco(precoOriginal);
    }
}
