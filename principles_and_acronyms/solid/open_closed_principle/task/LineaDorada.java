package principles_and_acronyms.solid.open_closed_principle.task;

public class LineaDorada extends Teleferico {

    public LineaDorada() {
        super("Golden");
    }

    @Override
    public void iniciarRecorrido() {
        System.out.println(String.format("The %s air cabinets have started their operations", super.getColor()));
    }

    @Override
    public void finalizarRecorrido() {
        System.out.println(String.format("The %s air cabinets have ended their operations", super.getColor()));
    }

    @Override
    public void detenerseEstacion() {
        System.out.println(
                String.format("The %s air cabinets have alerted and stopped their operations", super.getColor()));
    }

}
