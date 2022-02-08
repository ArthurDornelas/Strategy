package padrao.strategy;

public class Pedido {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void pagarComBoleto(double valor, double valorPago) {
        Pagamento pagamento = new Pagamento(valor, valorPago);
        this.valor = pagamento.realizarPagamento(new FormaPagamentoBoleto());
    }

    public void pagarComCredito(double valor, double valorPago) {
        Pagamento pagamento = new Pagamento(valor, valorPago);
        this.valor = pagamento.realizarPagamento(new FormaPagamentoCredito());
    }

    public void pagarComDebito(double valor, double valorPago) {
        Pagamento pagamento = new Pagamento(valor, valorPago);
        this.valor = pagamento.realizarPagamento(new FormaPagamentoDebito());
    }

    public void pagarComPix(double valor, double valorPago) {
        Pagamento pagamento = new Pagamento(valor, valorPago);
        this.valor = pagamento.realizarPagamento(new FormaPagamentoPix());
    }
}
