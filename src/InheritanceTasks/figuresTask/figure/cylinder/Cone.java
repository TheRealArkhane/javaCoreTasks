package InheritanceTasks.figuresTask.figure.cylinder;

public class Cone extends Cylinder {
    public Cone(double radius, double height, double liquidVolume) {
        super(radius, height, liquidVolume);
    }

    @Override
    public double getVolume() {
        return (this.getBaseArea() * this.getHeight()) / 3;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                ", liquidVolume=" + liquidVolume +
                ", liquidVolumeIndicator=" + this.indicateLiquidVolume() +
                "%" +
                ", Weight=" + this.getWeight() +
                "kg" + '}' + "\n";
    }
}
