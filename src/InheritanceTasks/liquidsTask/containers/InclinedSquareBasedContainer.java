package InheritanceTasks.liquidsTask.containers;

public class InclinedSquareBasedContainer extends SquareBasedContainer {

    public InclinedSquareBasedContainer(double side, double height) {
        super(side, height);
        this.basementArea = this.side * this.side;
    }

    @Override
    public double getVolume() {
        return super.getVolume() / 3;
    }

    @Override
    public String toString() {
        return String.format("""                
                Пирамидальная емкость
                Параметры:\s
                Длина стороны квадрата в основании: %.2f м
                Высота емкости: %.2f м
                Залитая жидкость: %s
                Масса: %.2f кг
                Объем: %f куб.м = %.2f л
                Площадь основания: %f кв.м""", this.side, this.height, this.liquidName, this.mass, this.getVolume(),
                this.getVolume() * LITRES_IN_CBM, this.basementArea);
    }
}
