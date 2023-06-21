package InheritanceTasks.liquidsTask.containers;

import InheritanceTasks.liquidsTask.liquids.Liquid;

import java.util.Objects;

public abstract class Container {

    protected double height;
    protected double basementArea;
    protected String liquidName = "Нет жидкости";
    protected double mass = 0;
    public static final int LITRES_IN_CBM = 1000;

    public double getVolume() {
        return this.height * basementArea;
    }

    public void fill(Liquid liquid) {
        this.liquidName = liquid.getName();
        this.mass = this.getVolume() * liquid.getDensity();
    }

    public double getMass () {
        return this.mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container container)) return false;
        if (this.hashCode() != container.hashCode()) return false;
        return Double.compare(container.height, height) == 0
                && Double.compare(container.basementArea, basementArea) == 0
                && Double.compare(container.getMass(), getMass()) == 0
                && liquidName.equals(container.liquidName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, basementArea, liquidName, getMass());
    }

    @Override
    public String toString() {
        return String.format("""                
                Емкость
                Параметры:\s
                Высота емкости: %.2f м
                Залитая жидкость: %s
                Масса: %.2f кг
                Объем: %f куб.м = %.2f л
                Площадь основания: %f кв.м""", this.height, this.liquidName, this.mass, this.getVolume(), this.getVolume() * LITRES_IN_CBM, this.basementArea);
    }
}
