public class Entregue implements Status{
    private Entregue() {};
    private static Entregue instance = new Entregue();

    public static Entregue getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pedido entregue";
    }
}