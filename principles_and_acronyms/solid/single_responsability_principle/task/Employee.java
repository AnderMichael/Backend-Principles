package principles_and_acronyms.solid.single_responsability_principle.task;
public class Employee {
    private String name;
    private String charge;

    public Employee(String name, String charge) {
        this.name = name;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }
}
