package principles_and_acronyms.solid.open_closed_principle.task;

public class LineaVerde extends Teleferico {

    public LineaVerde() {
        super("Green");
    }

    @Override
    public void iniciarRecorrido() {
        System.out.println(String.format("The %s module has started its operations", super.getColor()));
    }

    @Override
    public void finalizarRecorrido() {
        System.out.println(String.format("The %s module has ended its operations", super.getColor()));
    }

    @Override
    public void detenerseEstacion() {
        System.out.println(String.format("The %s module has been stopped due some reasons...", super.getColor()));
    }

}
