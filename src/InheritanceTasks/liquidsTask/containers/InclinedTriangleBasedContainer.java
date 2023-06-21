package InheritanceTasks.liquidsTask.containers;

public class InclinedTriangleBasedContainer extends TriangleBasedContainer {

    public InclinedTriangleBasedContainer(double side, double height) {
        super(side, height);
        this.basementArea = heronsFormula(side);
    }

    @Override
    public double getVolume() {
        return super.getVolume() / 3;
    }

    @Override
    public String toString() {
        return String.format("""                                        
                        Пирамидальная емкость с треугольным основанием
                        Параметры:\s
                        Длина стороны треугольника в основании: %.2f м
                        Высота емкости: %.2f м
                        Залитая жидкость: %s
                        Масса: %.2f кг
                        Объем: %f куб.м = %.2f л
                        Площадь основания: %f кв.м""", this.side, this.height, this.liquidName, this.mass, this.getVolume(),
                this.getVolume() * LITRES_IN_CBM, this.basementArea);
    }
}
