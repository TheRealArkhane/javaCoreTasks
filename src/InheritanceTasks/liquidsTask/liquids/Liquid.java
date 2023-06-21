package InheritanceTasks.liquidsTask.liquids;

import java.util.Objects;

public abstract class Liquid {

    protected String name;
    protected int density;
    public static final int PETROL_DENSITY = 740;


    public String getName() {
        return name;
    }

    public int getDensity() {
        return density;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Liquid liquid)) return false;
        if (this.hashCode() != o.hashCode()) return false;
        return getDensity() == liquid.getDensity() && Objects.equals(getName(), liquid.getName());
    }

    @Override
    public String toString() {
        return "Жидкость: " +
                "\nНазвание: " + this.name +
                "\nПлотность: " + this.density + " кг/куб.м";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDensity());
    }
}
