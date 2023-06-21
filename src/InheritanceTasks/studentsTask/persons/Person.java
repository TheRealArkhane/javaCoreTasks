package InheritanceTasks.studentsTask.persons;

import InheritanceTasks.studentsTask.enums.FirstNames;
import InheritanceTasks.studentsTask.enums.LastNames;
import InheritanceTasks.studentsTask.enums.MiddleNames;

import java.time.LocalDateTime;
import java.util.*;

public abstract class Person {

    public static Random random = new Random();
    protected final UUID uuid = UUID.randomUUID();
    protected String firstName = FirstNames.values()[random.nextInt(0, FirstNames.values().length)].getFirstNameFromEnum();
    protected String middleName = MiddleNames.values()[random.nextInt(0, MiddleNames.values().length)].getMiddleNameFromEnum();
    protected String lastName = LastNames.values()[random.nextInt(0, LastNames.values().length)].getLastNameFromEnum();
    protected Calendar birthDate = new GregorianCalendar(1970 + random.nextInt(0, 22), random.nextInt(0, 11), random.nextInt(1, 29));

    public UUID getUuid() {
        return uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return LocalDateTime.now().getYear() - birthDate.getWeekYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        if (this.hashCode() != o.hashCode()) return false;
        else return getUuid().equals(person.getUuid())
                && getFirstName().equals(person.getFirstName())
                && getMiddleName().equals(person.getMiddleName())
                && getLastName().equals(person.getLastName())
                && getBirthDate().equals(person.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUuid(), getFirstName(), getMiddleName(), getLastName(), getBirthDate());
    }

    @Override
    public String toString() {
        return "Person {" +
                "\nuuid='" + uuid + '\'' +
                "\nfirstName='" + firstName + '\'' +
                "\nmiddleName='" + middleName + '\'' +
                "\nlastName='" + lastName + '\'' +
                "\nbirthDate=" + birthDate.getTime() +
                "\nage=" + this.getAge() + "\n";
    }
}
