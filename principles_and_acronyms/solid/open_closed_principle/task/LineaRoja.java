package principles_and_acronyms.solid.open_closed_principle.task;

public class LineaRoja extends Teleferico {

    public LineaRoja() {
        super("Rojo");
    }

    @Override
    public void iniciarRecorrido() {
        System.out.println(String.format("La linea de color %s ha iniciado sus operaciones", super.getColor()));
    }

    @Override
    public void finalizarRecorrido() {
        System.out.println(String.format("La linea de color %s ha terminado sus operaciones", super.getColor()));
    }

    @Override
    public void detenerseEstacion() {
        System.out.println(String.format("La linea de color %s se ha detenido!!! Por alguna razon...", super.getColor()));
    }

}
