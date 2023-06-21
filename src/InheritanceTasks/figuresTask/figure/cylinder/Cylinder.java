package InheritanceTasks.figuresTask.figure.cylinder;


import InheritanceTasks.figuresTask.exceptions.LiquidVolumeException;
import InheritanceTasks.figuresTask.exceptions.PhysicalConditionException;
import InheritanceTasks.figuresTask.figure.Figure;

import java.util.Objects;

public class Cylinder extends Figure {

    protected double radius;

    public Cylinder(double radius, double height, double liquidVolume) {
        if (radius <= 0 || height <= 0 || liquidVolume < 0) {
            throw new PhysicalConditionException();
        }
        this.radius = radius;
        this.height = height;
        if (liquidVolume > this.getVolume()) {
            throw new LiquidVolumeException();
        }
        else {
            this.liquidVolume = liquidVolume;
        }
    }

    @Override
    public double getBaseArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cylinder cylinder)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(cylinder.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", liquidVolume=" + liquidVolume +
                ", liquidVolumeIndicator=" + this.indicateLiquidVolume() +
                "%" +
                ", Weight=" + this.getWeight() +
                "kg" + '}' + "\n";
    }
}
