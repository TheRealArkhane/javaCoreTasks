package InheritanceTasks.liquidsTask.liquids;

public class Petrol extends Liquid {

    private static final int PETROL_DENSITY = 740;

    public Petrol() {
        this.name = "Бензин";
        this.density = PETROL_DENSITY;
    }
}
