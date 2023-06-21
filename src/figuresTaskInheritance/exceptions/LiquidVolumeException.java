package figuresTaskInheritance.exceptions;

public class LiquidVolumeException extends RuntimeException {

    @Override
    public String toString() {
        return "Невозможно заполнить жидкостью сосуд сверх его объема";
    }
}
