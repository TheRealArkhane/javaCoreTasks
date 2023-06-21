package InheritanceTasks.liquidsTask.containers;

public class InclinedRoundBasedContainer extends RoundBasedContainer {

    public InclinedRoundBasedContainer(double radius, double height) {
        super(radius, height);
        this.basementArea = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return super.getVolume() / 3;
    }

    @Override
    public String toString() {
        return String.format("""
                Конусообразная емкость
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
