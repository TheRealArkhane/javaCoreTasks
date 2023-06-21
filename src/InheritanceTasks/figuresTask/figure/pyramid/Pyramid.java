package InheritanceTasks.figuresTask.figure.pyramid;


import InheritanceTasks.figuresTask.exceptions.LiquidVolumeException;
import InheritanceTasks.figuresTask.exceptions.PhysicalConditionException;
import InheritanceTasks.figuresTask.figure.Figure;

public class Pyramid extends Figure {

    public Pyramid (double length, double width, double height, double liquidVolume) {
        if (length <= 0 || width <= 0 || height <= 0 || liquidVolume < 0) {
            throw new PhysicalConditionException();
        }
        this.length = length;
        this.width = width;
        this.height = height;
        if (liquidVolume > this.getVolume()) {
            throw new LiquidVolumeException();
        }
        else {
            this.liquidVolume = liquidVolume;
        }
    }

    @Override
    public double getVolume() {
        return (this.getBaseArea() * this.getHeight()) / 3;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", liquidVolume=" + liquidVolume +
                ", liquidVolumeIndicator=" + this.indicateLiquidVolume() +
                "%" +
                ", Weight=" + this.getWeight() +
                "kg" + '}' + "\n";
    }
}
