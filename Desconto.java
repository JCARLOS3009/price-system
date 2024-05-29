// DescontoNatal.java
public class DescontoNatal implements Strategy {
    @Override
    public double calcularPreco(double precoOriginal) {
        return precoOriginal * 0.9; // 10% de desconto
    }
}

// DescontoAnoNovo.java
public class DescontoAnoNovo implements Strategy {
    @Override
    public double calcularPreco(double precoOriginal) {
        return precoOriginal * 0.8; // 20% de desconto
    }
}

// SemDesconto.java
public class SemDesconto implements Strategy {
    @Override
    public double calcularPreco(double precoOriginal) {
        return precoOriginal; // Sem desconto
    }
}
