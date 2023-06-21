package InheritanceTasks.studentsTask.persons;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import InheritanceTasks.studentsTask.enums.Department;

public class Professor extends Person {

    private final Department department;
    private final List<Student> students = new ArrayList<>();

    public Professor(Department department) {
        this.department = department;
    }

    public Professor(String firstName, String middleName, String lastName, Calendar birthDate, Department department) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "\nuuid=" + uuid +
                "\nfirstName='" + firstName + '\'' +
                "\nmiddleName='" + middleName + '\'' +
                "\nlastName='" + lastName + '\'' +
                "\nbirthDate=" + birthDate.getTime() +
                "\ndepartment=" + department +
                "\nage=" + this.getAge() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor professor)) return false;
        if (!super.equals(o)) return false;
        return getDepartment() == professor.getDepartment() && Objects.equals(getStudents(), professor.getStudents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDepartment());
    }
}
