package InheritanceTasks.shopTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Seller extends Person {

    public static List<Product> overallSellList = initializeDefaultProductList();
    private final List<Product> personalSellList = initializeDefaultProductList();

    public Seller() {
    }

    public Seller(String name) {
        super(name);
    }

    public void purchase(Customer customer, Product product) {
        customer.removeMoney(product.getPrice());
        overallSellList.get(overallSellList.indexOf(product)).addProductSellCount(1);
        this.personalSellList.get(this.personalSellList.indexOf(product)).addProductSellCount(1);
    }

    public List<Product> getPersonalSellList() {
        return this.personalSellList;
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
        Seller other = (Seller) obj;
        return Objects.equals(this.name, other.name)
                && (this.personalSellList.equals(other.personalSellList));
    }

    public static List<Product> initializeDefaultProductList() {
        List<Product> defaultProductsList = new ArrayList<>();
        defaultProductsList.add(new Product("Бас", 100));
        defaultProductsList.add(new Product("Гитара", 150));
        defaultProductsList.add(new Product("Скрипка", 200));
        return defaultProductsList;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 31 + 1;
    }

    @Override
    public String toString() {
        return "Продавец\nИмя: " + this.name;
    }

}
