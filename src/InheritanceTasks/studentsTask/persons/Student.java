package InheritanceTasks.studentsTask.persons;

import InheritanceTasks.studentsTask.enums.Faculty;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Student extends Person {

    private final Faculty faculty;
    private final List<Professor> professors = new ArrayList<>();

    public Student(Faculty faculty) {
        this.faculty = faculty;
    }

    public Student(String firstName, String middleName, String lastName, Calendar birthDate, Faculty faculty) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return getFaculty() == student.getFaculty() && Objects.equals(getProfessors(), student.getProfessors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFaculty());
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nuuid='" + uuid + '\'' +
                "\nfirstName='" + firstName + '\'' +
                "\nmiddleName='" + middleName + '\'' +
                "\nlastName='" + lastName + '\'' +
                "\nbirthDate=" + birthDate.getTime() +
                "\nfaculty=" + faculty +
                "\nage=" + this.getAge() + "\n";
    }
}
