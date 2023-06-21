package InheritanceTasks.figuresTask.exceptions;

public class EmptyFigureException extends RuntimeException {

    @Override
    public String toString() {
        return "Ќевозможно вылить жидкость из пустого сосуда";
    }
}
