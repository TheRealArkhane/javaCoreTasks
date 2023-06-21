package figuresTaskInheritance.exceptions;

public class IdenticalFiguresException extends RuntimeException{

    @Override
    public String toString() {
        return "Невозможно провести операцию над тем же самым сосудом";
    }
}
