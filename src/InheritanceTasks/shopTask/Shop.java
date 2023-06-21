package InheritanceTasks.shopTask;

/*
Реализовать магазин. В магазин приходят клиенты и в нём работают продавцы.
Так же в магазине ведётся подсчёт купленных товаров (общее табло).
Есть три вида товаров стоимостью 100,150,200
В день магазин посещают 50 человек с разным количеством денег которое генерируется случайно в диапазоне от 50 до 500р.
Каждый человек покупает один случайный товар (нужный товар генерируется случайно),если у него есть нужная сумма на руках.
Каждый продавец после продажи товара пополняет общий и личный счётчик товаров . Всего продавцов 4 человека.
Программа должна выводить общий счётчик товаров и личный счётчик каждого из продавцов с его именем.
Покупатель и продавец должны реализовывать общий интерфейс Person с методом getName()
Общий счётчик проданных товаров должен быть статической переменной класса Seller.
Класс Shop является сервисным и выполняет агрегацию процессов (алгоритм обслуживания), а так же имеет поле List<Seller> employers
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {

    public static List<Seller> employees = initializeDefaultEmployeeList();

    public static void main(String[] args) {
        shift(2);
    }

    public static void shift(int numberOfDays) {
        Random random = new Random();
        int productIndex;
        int numberOfCustomers = 50;
        Product product;
        for (int i = 0; i < numberOfCustomers * numberOfDays; i++) {
            Customer customer = new Customer();
            Seller seller = employees.get(random.nextInt(employees.size()));
            if (customer.getMoney() >= 200) {
                productIndex = random.nextInt(Seller.overallSellList.size());
                product = Seller.overallSellList.get(productIndex);
                seller.purchase(customer, product);
            }
            else if (customer.getMoney() >= 150) {
                productIndex = random.nextInt(Seller.overallSellList.size() - 1);
                product = Seller.overallSellList.get(productIndex);
                seller.purchase(customer, product);
            }
            else if (customer.getMoney() >= 100) {
                productIndex = 0;
                product = Seller.overallSellList.get(productIndex);
                seller.purchase(customer, product);
            }
        }
        productSellReport(Seller.overallSellList);
        employeesReport(employees);
    }

    public static List<Seller> initializeDefaultEmployeeList() {
        List<Seller> employees = new ArrayList<>();
        employees.add(new Seller());
        employees.add(new Seller());
        employees.add(new Seller());
        employees.add(new Seller(Names.KAREN_STEPANYANC.name));
        return employees;
    }

    public static void productSellReport(List<Product> productList) {
        int overall = 0;
        int revenue = 0;
        System.out.println("-----ОТЧЕТ ПО ТОВАРУ-----");
        System.out.println("По итогу смены продано: ");
        for (Product product : productList) {
            overall += product.getProductSellCount();
            revenue += product.getPrice() * product.getProductSellCount();
            System.out.println(product.getName() + ": " + product.getProductSellCount() +
                    " шт на сумму: " + product.getPrice() * product.getProductSellCount() + " y.e.");
        }
        System.out.println("ИТОГО:");
        System.out.println("Общее число продаж: " + overall + " шт" + "\nВыручка составила: " + revenue + " y.e.");
        System.out.println("-----ОТЧЕТ ЗАКОНЧЕН-----");
    }

    public static void employeePersonalSellReport(Seller seller) {
        int overall = 0;
        int revenue = 0;
        System.out.println("-----" + seller.name.toUpperCase() + "-----");
        System.out.println("Продавец " + seller.name + " продал(а) за смену: ");
        for (Product product : seller.getPersonalSellList()) {
            overall += product.getProductSellCount();
            revenue += product.getPrice() * product.getProductSellCount();
            System.out.println(product.getName() + ": " + product.getProductSellCount() +
                    " шт на сумму: " + product.getPrice() * product.getProductSellCount() + " y.e.");
        }
        System.out.println("Всего товара продано продавцом: " + overall + " шт" + "\nОбщая выручка продавца составила: " + revenue + " y.e.");
    }

    public static void employeesReport(List<Seller> employees) {
        System.out.println("\n-----ОТЧЕТ ПО РАБОТНИКАМ-----");
        for (Seller seller : employees) {
            employeePersonalSellReport(seller);
        }
        System.out.println("-----КОНЕЦ ОТЧЕТА РАБОТНИКОВ-----");
    }
}
