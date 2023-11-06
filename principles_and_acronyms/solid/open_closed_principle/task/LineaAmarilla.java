package principles_and_acronyms.solid.open_closed_principle.task;

public class LineaAmarilla extends Teleferico {

    public LineaAmarilla() {
        super("Amarillo");
    }

    @Override
    public void iniciarRecorrido() {
        System.out.println(String.format("La linea de color %s ha empezado con sus operaciones", super.getColor()));
    }

    @Override
    public void finalizarRecorrido() {
        System.out.println(String.format("La linea de color %s ha culminado sus operaciones", super.getColor()));
    }

    @Override
    public void detenerseEstacion() {
        System.out.println(String.format("La linea de color %s se ha parado!!! Por alguna razon...", super.getColor()));
    }

}
