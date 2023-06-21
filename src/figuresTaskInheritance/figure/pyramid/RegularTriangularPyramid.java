package figuresTaskInheritance.figure.pyramid;



import figuresTaskInheritance.exceptions.LiquidVolumeException;
import figuresTaskInheritance.exceptions.PhysicalConditionException;
import figuresTaskInheritance.figure.Figure;

import java.util.Objects;

public class RegularTriangularPyramid extends Figure {

    private double side;

    public RegularTriangularPyramid(double side, double height, double liquidVolume) {
        if (side <= 0 || height <= 0 || liquidVolume < 0) {
            throw new PhysicalConditionException();
        }
            this.side = side;
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
        return this.getSide() * this.getHeight() / 2;
    }

    @Override
    public double getVolume() {
        return (this.getBaseArea() * this.getHeight()) / 3;
    }

    public double getSide() {
        return side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegularTriangularPyramid that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getSide(), getSide()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSide());
    }

    @Override
    public String toString() {
        return "RegularTriangularPyramid{" +
                "side=" + side +
                ", height=" + height +
                ", liquidVolume=" + liquidVolume +
                ", liquidVolumeIndicator=" + this.indicateLiquidVolume() +
                "%" +
                ", Weight=" + this.getWeight() +
                "kg" + '}' + "\n";
    }

}
