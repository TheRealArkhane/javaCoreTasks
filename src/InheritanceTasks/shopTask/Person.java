package InheritanceTasks.shopTask;


import java.util.Objects;
import java.util.Random;

public class Person {

    public static Random random = new Random();
    protected String name;

    public Person() {
        this.name = Names.values()[random.nextInt(Names.values().length)].name;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else if (obj == null) {
            return false;
        }
        else if (this.getClass() != obj.getClass()) {
            return false;
        }
        else if (this.hashCode() != obj.hashCode()) {
            return false;
        }
        Person other = (Person) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 31;
    }

    @Override
    public String toString() {
        return "Человек\nИмя: " + this.name;
    }

}
