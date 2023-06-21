package InheritanceTasks.studentsTask.enums;

public enum FirstNames {

    IVAN("Иван"),
    EVGENIY("Евгений"),
    VICTOR("Виктор"),
    BOGDAN("Богдан"),
    ANDREY("Андрей"),
    ALEXEY("Алексей"),
    AMIR("Амир"),
    IGOR("Игорь"),
    GENNADIY("Геннадий"),
    OLEG("Олег"),
    VASILIY("Василий"),
    STEPAN("Степан");

    private final String firstName;

    FirstNames(String name) {
        this.firstName = name;
    }

    public String getFirstNameFromEnum() {
        return firstName;
    }
}
