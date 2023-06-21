package InheritanceTasks.figuresTask.figure;

import InheritanceTasks.figuresTask.exceptions.*;

import java.util.Objects;

public abstract class Figure implements Fluidable {

    protected double length;
    protected double width;
    protected double height;
    protected double liquidVolume = 0;


    public double getBaseArea() {
        return this.getLength() * this.getWidth();
    }

    public double getVolume() {
        return this.getBaseArea() * this.getHeight();
    }

    public double getWeight() {
        return this.getLiquidVolume() * Fluidable.density;
    }

    @Override
    public boolean isFull() {
        return this.getVolume() == this.getLiquidVolume();
    }

    @Override
    public boolean isEmpty() {
        return this.getLiquidVolume() == 0;
    }

    @Override
    public void fill(Figure figureToFill, double quantityOfLiquid) {
        if (quantityOfLiquid < 0) {
            throw new PhysicalConditionException();
        }
        if (this == figureToFill) {
            throw new IdenticalFiguresException();
        }
        if (this.isEmpty()) {
            throw new EmptyFigureException();
        }
        else if (quantityOfLiquid > this.getLiquidVolume()) {
            throw new PourOutException();
        }
        else if (figureToFill.isFull()) {
            throw new LiquidVolumeException();
        }
        else if (quantityOfLiquid > figureToFill.getVolume() - figureToFill.getLiquidVolume()) {
            this.setLiquidVolume(this.getLiquidVolume() - (figureToFill.getVolume() - figureToFill.getLiquidVolume()));
            figureToFill.setLiquidVolume(figureToFill.getVolume());
            figureToFill.indicateLiquidVolume();
        }
        else {
            figureToFill.setLiquidVolume(figureToFill.getLiquidVolume() + quantityOfLiquid);
            figureToFill.indicateLiquidVolume();
            this.setLiquidVolume(this.getLiquidVolume() - quantityOfLiquid);
        }
    }

    @Override
    public void pourOut(double liquidVolumeToPourOut) {
        if (liquidVolumeToPourOut < 0) {
                throw new PhysicalConditionException();
        }
        if (liquidVolumeToPourOut > this.getLiquidVolume()) {
            throw new PourOutException();
        }
        this.setLiquidVolume(this.getLiquidVolume() - liquidVolumeToPourOut);
        this.indicateLiquidVolume();
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLiquidVolume() {
        return liquidVolume;
    }

    private void setLiquidVolume(double liquidVolume) {
        this.liquidVolume = liquidVolume;
    }

    public double indicateLiquidVolume() {
        return (this.getLiquidVolume() / this.getVolume()) * 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure figure)) return false;
        return Double.compare(figure.getLength(), getLength()) == 0
                && Double.compare(figure.getWidth(), getWidth()) == 0
                && Double.compare(figure.getHeight(), getHeight()) == 0
                && Double.compare(figure.getLiquidVolume(), getLiquidVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth(), getHeight(), getLiquidVolume());
    }

    @Override
    public String toString() {
        return "Figure{" + "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", liquidVolume=" + liquidVolume +
                ", liquidVolumeIndicator=" + this.indicateLiquidVolume() +
                "%" +
                ", Weight=" + this.getWeight() +
                " kg" + '}' + "\n";
    }
}
