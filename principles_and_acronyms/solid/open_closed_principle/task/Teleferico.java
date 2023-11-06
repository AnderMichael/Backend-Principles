package principles_and_acronyms.solid.open_closed_principle.task;

public abstract class Teleferico {
    private String color;

    public Teleferico(String color) {
        this.color = color;
    }

    public abstract void iniciarRecorrido();

    public abstract void finalizarRecorrido();

    public abstract void detenerseEstacion();

    public String getColor() {
        return color;
    }
}
