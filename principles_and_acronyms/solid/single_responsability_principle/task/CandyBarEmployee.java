package principles_and_acronyms.solid.single_responsability_principle.task;

public class CandyBarEmployee extends Employee implements ConcessionStandWorker {

    public CandyBarEmployee(String name) {
        super(name, "Candy Bar Employee");
    }

    @Override
    public void serveSnack() {
        System.out.println(String.format("The employee %s has served some snacks", super.getName()));
    }

    @Override
    public void restockItems() {
        System.out.println(String.format("The employee %s has restocked all the items", super.getName()));
    }

    @Override
    public void processPayment() {
        System.out.println(String.format("The employee %s has processed the payment", super.getName()));
    }

}
