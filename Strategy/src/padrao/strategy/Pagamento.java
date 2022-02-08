package padrao.strategy;

public class Pagamento {
    private double valor;
    private double valorPago;

    public Pagamento(double valor, double valorPago) {
        this.valor = valor;
        this.valorPago = valorPago;
    }

    public double realizarPagamento(IFormaPagamento formaPagamento) {
        return formaPagamento.realizarPagamento(valor, valorPago);
    }
}
