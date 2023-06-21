package InheritanceTasks.shopTask;

import java.util.Objects;

public class Product {

    private final int price;
    private final String name;
    private int productSellCount = 0;

    public Product(String name, int price) {
        catchException(price);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getProductSellCount() {
        return this.productSellCount;
    }

    public void addProductSellCount(int value) {
        this.productSellCount += value;
    }


    @Override
    public String toString() {
        return "Название: " + this.name + "\nЦена: " + this.price;
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
        Product other = (Product) obj;
        return Objects.equals(this.name, other.name)
                && this.price == other.price;
    }

    @Override
    public int hashCode() {
        return (name.hashCode() + price) * 29;
    }

    public static void catchException(int value) {
        if (value < 0) {
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException exception) {
                exception.printStackTrace();
                System.exit(0);
            }
        }
    }
}
