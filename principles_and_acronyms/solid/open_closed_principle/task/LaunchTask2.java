package principles_and_acronyms.solid.open_closed_principle.task;

public class LaunchTask2 {
    public static void main(String[] args) {
        System.out.println("\nBienvenidos a 2014!\n");
        // 2014
        Teleferico[] telefericos2014 = { new LineaRoja(), new LineaAmarilla(), new LineaVerde() };
        for (Teleferico teleferico : telefericos2014) {
            teleferico.iniciarRecorrido();
            teleferico.detenerseEstacion();
            teleferico.finalizarRecorrido();
        }

        System.out.println("\nBienvenidos a 2035!\n");
        // 2035
        Teleferico[] telefericos2035 = { new LineaRoja(), new LineaAmarilla(), new LineaVerde(), new LineaDorada() };
        for (Teleferico teleferico : telefericos2035) {
            teleferico.iniciarRecorrido();
            teleferico.detenerseEstacion();
            teleferico.finalizarRecorrido();
        }
    }
}
