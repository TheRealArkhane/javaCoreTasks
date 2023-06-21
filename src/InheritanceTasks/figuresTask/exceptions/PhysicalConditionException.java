package InheritanceTasks.figuresTask.exceptions;

public class PhysicalConditionException extends RuntimeException {

    @Override
    public String toString() {
        return "Величина не может быть отрицательной или равняться нулю в данных условиях";
    }
}
