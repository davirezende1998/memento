public class EmEntrega implements Status{
    private EmEntrega() {};
    private static EmEntrega instance = new EmEntrega();

    public static EmEntrega getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pedido em rota de entrega";
    }
}