public class Preparacao implements Status{
    private Preparacao() {};
    private static Preparacao instance = new Preparacao();

    public static Preparacao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pedido em preparação";
    }
}