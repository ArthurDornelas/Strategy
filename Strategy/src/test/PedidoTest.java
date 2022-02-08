package test;

import org.junit.jupiter.api.Test;
import padrao.strategy.Pedido;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {
    @Test
    void deveRealizarPagamentoBoleto() {
        Pedido pedido = new Pedido();
        pedido.pagarComBoleto(50.0, 20.0);
        assertEquals(25.0, pedido.getValor());
    }

    @Test
    void deveRealizarPagamentoCredito() {
        Pedido pedido = new Pedido();
        pedido.pagarComCredito(50.0, 20.0);
        assertEquals(30.0, pedido.getValor());
    }

    @Test
    void deveRealizarPagamentoDebito() {
        Pedido pedido = new Pedido();
        pedido.pagarComDebito(50.0, 20.0);
        assertEquals(27.5, pedido.getValor());
    }

    @Test
    void deveRealizarPagamentoPix() {
        Pedido pedido = new Pedido();
        pedido.pagarComPix(50.0, 20.0);
        assertEquals(22.5, pedido.getValor());
    }

    @Test
    void naoDeveRealizarPagamentoPixComValorIgualZero() {
        try {
            Pedido pedido = new Pedido();
            pedido.pagarComPix(0, 20.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor já é zero", e.getMessage());
        }
    }

    @Test
    void naoDeveRealizarPagamentoBoletoComValorIgualZero() {
        try {
            Pedido pedido = new Pedido();
            pedido.pagarComBoleto(0, 20.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor já é zero", e.getMessage());
        }
    }

    @Test
    void naoDeveRealizarPagamentoCreditoComValorIgualZero() {
        try {
            Pedido pedido = new Pedido();
            pedido.pagarComCredito(0, 20.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor já é zero", e.getMessage());
        }
    }

    @Test
    void naoDeveRealizarPagamentoDebitoComValorIgualZero() {
        try {
            Pedido pedido = new Pedido();
            pedido.pagarComDebito(0, 20.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor já é zero", e.getMessage());
        }
    }
}
