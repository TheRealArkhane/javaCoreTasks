package InheritanceTasks.liquidsTask.liquids;

public class Water extends Liquid {

    private static final int WATER_DENSITY = 997;

    public Water() {
        this.name = "Вода";
        this.density = WATER_DENSITY;
    }
}
