package InheritanceTasks.figuresTask.exceptions;

public class PourOutException extends RuntimeException{

    @Override
    public String toString() {
        return "Невозможно вылить жидкости из сосуда больше, чем в нем есть";
    }
}
