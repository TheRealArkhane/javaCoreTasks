package InheritanceTasks.shopTask;

import java.util.Objects;

public class Customer extends Person {

    private int money;

    public Customer() {
        this.money = 50 + random.nextInt(500 - 50 + 1);
    }

    public int getMoney() {
        return this.money;
    }

    public void removeMoney(int value) {
        this.money -= value;
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
        Customer other = (Customer) obj;
        return Objects.equals(this.name, other.name)
                && (this.money == other.money);
    }

    @Override
    public int hashCode() {
        return (name.hashCode() + this.money) * 31;
    }

    @Override
    public String toString() {
        return "Покупатель\nИмя: " + this.name + "\nКоличество денег: " + this.money;
    }
}
