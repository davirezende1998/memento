import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    @Test
    void deveArmazenarEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(Pago.getInstance());
        pedido.setEstado(EmEntrega.getInstance());
        pedido.setEstado(Entregue.getInstance());
        assertEquals(3, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pedido pedido = new Pedido();
        pedido.setEstado(Pago.getInstance());
        pedido.setEstado(Preparacao.getInstance());
        pedido.setEstado(EmEntrega.getInstance());
        pedido.restauraEstado(0);
        assertEquals(Pago.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(Pago.getInstance());
        pedido.setEstado(Preparacao.getInstance());
        pedido.setEstado(EmEntrega.getInstance());
        pedido.setEstado(Entregue.getInstance());
        pedido.restauraEstado(2);
        assertEquals(EmEntrega.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.setEstado(Pago.getInstance());
            pedido.restauraEstado(1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}