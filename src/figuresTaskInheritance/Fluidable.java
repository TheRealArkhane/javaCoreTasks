package figuresTaskInheritance;


import figuresTaskInheritance.figure.Figure;

public interface Fluidable {

    int density = 1000;

    boolean isEmpty();
    boolean isFull();
    void fill(Figure figure, double quantityOfLiquid);
    void pourOut(double liquidVolumeToPourOut);
}
