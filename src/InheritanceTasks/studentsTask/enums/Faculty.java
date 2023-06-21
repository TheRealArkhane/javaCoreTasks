package InheritanceTasks.studentsTask.enums;

public enum Faculty {

    FACULTY_OF_ECONOMICS(new Department[]{Department.ACCOUNTING_DEPARTMENT, Department.DEPARTMENT_OF_ANALYSIS_AND_AUDIT}),
    FACULTY_OF_LAW(new Department[]{Department.DEPARTMENT_OF_CRIMINALISTICS, Department.DEPARTMENT_OF_INTERNATIONAL_LAW}),
    FACULTY_OF_HISTORY(new Department[]{Department.DEPARTMENT_OF_ARCHEOLOGY, Department.DEPARTMENT_OF_RUSSIAN_HISTORY}),
    FACULTY_OF_PHYSICS(new Department[]{Department.DEPARTMENT_OF_NUCLEAR_PHYSICS, Department.DEPARTMENT_OF_RADIOPHYSICS}),
    FACULTY_OF_CHEMISTRY(new Department[]{Department.DEPARTMENT_OF_ORGANIC_CHEMISTRY, Department.DEPARTMENT_OF_INORGANIC_CHEMISTRY}),
    FACULTY_OF_MATH(new Department[]{Department.DEPARTMENT_OF_COMPUTATIONAL_MATH, Department.DEPARTMENT_OF_MATH_ANALYSIS});

    private final Department[] departmentsArray;

    Faculty(Department[] departmentsArray) {
        this.departmentsArray = departmentsArray;
    }

    public Department[] getDepartmentsArray() {
        return departmentsArray;
    }
}
