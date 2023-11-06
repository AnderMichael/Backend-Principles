package principles_and_acronyms.solid.single_responsability_principle.task;

public class ProjectorEmployee extends Employee implements MovieProjector {

    public ProjectorEmployee(String name) {
        super(name, "Projector Employee");
    }

    @Override
    public void startProjection() {
        System.out.println(String.format("The employee %s has started the movie", super.getName()));
    }

    @Override
    public void stopProjection() {
        System.out.println(String.format("The employee %s has stopped the movie", super.getName()));

    }

    @Override
    public void checkProjectorStatus() {
        System.out.println(String.format("The employee %s has checked the movie projector", super.getName()));
    }

}
