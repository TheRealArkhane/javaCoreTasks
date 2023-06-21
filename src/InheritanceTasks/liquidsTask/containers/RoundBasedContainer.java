package InheritanceTasks.liquidsTask.containers;

public class RoundBasedContainer extends Container {

    protected double radius;

    public RoundBasedContainer (double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.basementArea = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("""                
                Цилиндрическая емкость
                Параметры:\s
                Радиус окружности основания: %.2f м
                Высота емкости: %.2f м
                Залитая жидкость: %s
                Масса: %.2f кг
                Объем: %f куб.м = %.2f л
                Площадь основания: %f кв.м""", this.radius, this.height, this.liquidName, this.mass, this.getVolume(),
                this.getVolume() * LITRES_IN_CBM, this.basementArea);
    }
}
