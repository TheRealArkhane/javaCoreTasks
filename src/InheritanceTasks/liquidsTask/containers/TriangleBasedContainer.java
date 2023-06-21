package InheritanceTasks.liquidsTask.containers;

/*
    Для упрощения допускаю, что основание - равносторонний треугольник.
 */

public class TriangleBasedContainer extends Container{

    protected double side;

    public TriangleBasedContainer(double side, double height) {
        this.side = side;
        this.height = height;
        this.basementArea = heronsFormula(side);
    }

    protected static double heronsFormula(double side) {
        double semiperimeter = side * 3 / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side)
                * (semiperimeter - side) * (semiperimeter - side));
    }

    @Override
    public String toString() {
        return String.format("""               
                Емкость с треугольным основанием и прямыми стенками
                Параметры:\s
                Сторона треугольника в основании: %.2f м
                Высота емкости: %.2f м
                Залитая жидкость: %s
                Масса: %.2f кг
                Объем: %f куб.м = %.2f л
                Площадь основания: %f кв.м""", this.side, this.height, this.liquidName, this.mass, this.getVolume(),
                this.getVolume() * LITRES_IN_CBM, this.basementArea);
    }
}
