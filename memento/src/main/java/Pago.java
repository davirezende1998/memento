public class Pago implements Status{
    private Pago() {};
    private static Pago instance = new Pago();

    public static Pago getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pedido pago";
    }
}