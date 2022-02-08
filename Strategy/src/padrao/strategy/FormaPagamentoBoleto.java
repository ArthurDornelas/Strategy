package padrao.strategy;

public class FormaPagamentoBoleto implements IFormaPagamento {

    public double realizarPagamento(double valor, double valorPago) {
        if(valor <= 0.0) {
            throw new IllegalArgumentException("Valor já é zero");
        }
        return ((valor - (valor * 0.1)) - valorPago);
    }
}
