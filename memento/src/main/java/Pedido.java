import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Status status;
    private List<Status> memento = new ArrayList<Status>();

    public Status getEstado() {
        return this.status;
    }

    public void setEstado(Status status) {
        this.status = status;
        this.memento.add(this.status);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.status = this.memento.get(indice);
    }

    public List<Status> getEstados() {
        return this.memento;
    }
}