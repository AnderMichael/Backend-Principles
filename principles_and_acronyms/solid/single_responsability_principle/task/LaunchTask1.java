package principles_and_acronyms.solid.single_responsability_principle.task;

public class LaunchTask1 {
    public static void main(String[] args) {
        System.out.println("Welcome to the best cinema of the world!");
        TicketSeller ticketSeller = new TicketSellerEmployee("Huguito");
        MovieProjector movieProjector = new ProjectorEmployee("Samy");
        ConcessionStandWorker concessionStandWorker = new CandyBarEmployee("Ander");

        ticketSeller.checkTicketAvailability();
        ticketSeller.refundTicket();
        ticketSeller.sellTicket();

        movieProjector.checkProjectorStatus();
        movieProjector.startProjection();
        movieProjector.stopProjection();

        concessionStandWorker.restockItems();
        concessionStandWorker.serveSnack();
        concessionStandWorker.processPayment();
    }
}
