package InheritanceTasks.studentsTask.enums;

public enum LastNames {

    MILOVANOV("Милованов"),
    FEDYANIN("Федянин"),
    STETSENKO("Стеценко"),
    ZHMIHOVSKIY("Жмыховский"),
    KUROLESOV("Куролесов"),
    LEONOV("Леонов"),
    AVDEEV("Авдеев"),
    MARAKHOV("Марахов"),
    PERESELKOV("Переселков"),
    ZELENSKIY("Зеленский"),
    SISOEV("Сысоев"),
    PRIDONSKOY("Придонской"),
    MOHAMMAD("Мохаммад"),
    SVIRIDOV("Свиридов"),
    FROLOV("Фролов"),
    POTAPOV("Потапов"),
    PUHONIN("Пухонин");


    private final String lastName;

    LastNames(String lastName){
        this.lastName = lastName;
    }

    public String getLastNameFromEnum() {
        return lastName;
    }
}
