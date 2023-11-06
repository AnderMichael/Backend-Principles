package principles_and_acronyms.solid.single_responsability_principle.task;

public class TicketSellerEmployee extends Employee implements TicketSeller {

    public TicketSellerEmployee(String name) {
        super(name, "Ticket Seller Employee");
    }

    @Override
    public void sellTicket() {
        System.out.println(String.format("The employee %s has selled a ticket", super.getName()));
    }

    @Override
    public void refundTicket() {
        System.out.println(String.format("The employee %s has refunded the availability of a ticket", super.getName()));
    }

    @Override
    public void checkTicketAvailability() {
        System.out.println(String.format("The employee %s has checked the availability of a ticket", super.getName()));
    }

}
