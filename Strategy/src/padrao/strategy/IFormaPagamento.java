package padrao.strategy;

public interface IFormaPagamento {
    double realizarPagamento(double valor, double valorPago);
}
