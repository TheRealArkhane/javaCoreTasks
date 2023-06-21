package InheritanceTasks.liquidsTask.containers;

public class SquareBasedContainer extends Container {

    protected double side;

    public SquareBasedContainer(double side, double height) {
        this.side = side;
        this.height = height;
        this.basementArea = this.side * this.side;
    }

    @Override
    public String toString() {
        return String.format("""               
                Прямоугольная емкость
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
