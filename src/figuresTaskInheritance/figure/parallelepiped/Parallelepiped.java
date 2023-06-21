package figuresTaskInheritance.figure.parallelepiped;


import figuresTaskInheritance.exceptions.LiquidVolumeException;
import figuresTaskInheritance.exceptions.PhysicalConditionException;
import figuresTaskInheritance.figure.Figure;

public class Parallelepiped extends Figure {

    public Parallelepiped(double length, double width, double height, double liquidVolume) {
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
    public String toString() {
        return "Parallelepiped{" + "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", liquidVolume=" + liquidVolume +
                ", liquidVolumeIndicator=" + this.indicateLiquidVolume() +
                "%" +
                ", Weight=" + this.getWeight() +
                "kg" + '}' + "\n";
    }
}
