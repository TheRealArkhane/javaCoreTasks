package InheritanceTasks.studentsTask.enums;

public enum MiddleNames {

    OLEGOVICH("Олегович"),
    IVANOVICH("Иванович"),
    ZAHAROVICH("Захарович"),
    ALEXEEVICH("Алексеевич"),
    VLADIMIROVICH("Владимирович"),
    VICTOROVICH("Викторович"),
    VYACHESLAVOVICH("Вячеславович"),
    SERGEEVICH("Сергеевич"),
    GRIGORIEVICH("Григорьевич");

    private final String middleName;

    MiddleNames(String middleName){
        this.middleName = middleName;
    }

    public String getMiddleNameFromEnum() {
        return middleName;
    }
}
