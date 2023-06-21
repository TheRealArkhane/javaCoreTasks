package InheritanceTasks.studentsTask;

import InheritanceTasks.studentsTask.enums.Department;
import InheritanceTasks.studentsTask.enums.Faculty;
import InheritanceTasks.studentsTask.persons.Professor;
import InheritanceTasks.studentsTask.persons.Student;

import java.util.*;
import java.util.stream.Collectors;

public class University {

    public static Random random = new Random();
    public static List<Professor> professorList = createProfessorList(8);
    public static List<Student> studentsList = createStudentList(30);


    public static void main(String[] args) {
        setCurriculum(professorList, studentsList);
        System.out.println(getPairsWithFirstCondition(Department.ACCOUNTING_DEPARTMENT));
    }

    public static List<Professor> createProfessorList (int number) {
        List<Professor> professorList = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            professorList.add(new Professor(Department.values()[random.nextInt(0, Department.values().length)]));
        }
        return professorList;
    }

    public static List<Student> createStudentList (int number) {
        List<Student> studentList = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            studentList.add(new Student(Faculty.values()[random.nextInt(0, Faculty.values().length)]));
        }
        return studentList;
    }

    public static void setCurriculum(List<Professor> professors, List<Student> students) {
        for (Student student : students) {
            for (Professor professor : professors) {
                if (Arrays.stream(student.getFaculty().getDepartmentsArray()).toList().contains(professor.getDepartment())) {
                    professor.addStudent(student);
                    student.addProfessor(professor);
                }
            }
        }
    }

    public static List<Student> getStudentsListSortedAlphabetically(List<Student> students) {
        return students.stream().sorted(Comparator.comparing(Student::getLastName)
                .thenComparing(Student::getMiddleName)
                .thenComparing(Student::getFirstName))
                .collect(Collectors.toList());
    }

    public static List<Professor> getProfessorListSortedByBirthDate(List<Professor> professors) {
        return professors.stream().sorted(Comparator.comparing(Professor::getBirthDate)).collect(Collectors.toList());
    }

    public static List<Professor> getProfessorListWithMoreThanSomeStudentsEducating(List<Professor> professors, int numberOfStudents) {
        return professors.stream().filter(professor -> professor.getStudents().size() > numberOfStudents).collect(Collectors.toList());
    }

    public static List<Student> getStudentsListWhoStudyWithChosenProfessor(Professor professor) {
        return studentsList.stream().filter(student -> student.getProfessors().contains(professor)).collect(Collectors.toList());
    }

    public static List<Student> getStudentsListWhoStudyWithChosenProfessorsList(List<Professor> professors) {
        return studentsList.stream().filter(student -> student.getProfessors().equals(professors)).collect(Collectors.toList());
    }

    public static List<Student> getStudentsListWhoDidNotStudyWithTwoProfessorsAtTheSameTime(Professor professor1, Professor professor2) {
        return studentsList.stream().filter(student -> !student.getProfessors().contains(professor1))
                .filter(student -> !student.getProfessors().contains(professor2)).collect(Collectors.toList());
    }

    public static Map<Student, List<Professor>> getPairsWithStudentsAboveThisAge (int age) {
        List<Student> students = studentsList.stream().filter(student -> student.getAge() > age).collect(Collectors.toList());
        Map<Student, List<Professor>> map = new HashMap<>();
        for (Student student : students) {
            map.put(student, student.getProfessors());
        }
        return map;
    }

    public static Map<Professor, List<Student>> getPairsWithFirstCondition(Department department) {
        List<Professor> professors = professorList.stream().filter(professor -> professor.getDepartment().equals(department)).collect(Collectors.toList());
        Map<Professor, List<Student>> map = new HashMap<>();
        for (Professor professor : professors) {
            map.put(professor, professor.getStudents());
        }
        return map;
    }
}
