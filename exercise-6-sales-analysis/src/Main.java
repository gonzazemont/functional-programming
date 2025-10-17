/*
Objective: use filter, mapToDouble, sum, average, collect.
Description:
You have a list of sales (class Sale with fields amount and category).

You want to calculate:
Total sales amount.
Average sales for a specific category.
List of sales greater than a certain value.
 */

import logic.Sale;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
                new Sale(100.0, "Electronics"),
                new Sale(200.0, "Clothing"),
                new Sale(150.0, "Electronics"),
                new Sale(300.0, "Furniture"),
                new Sale(250.0, "Clothing"),
                new Sale(400.0, "Electronics"),
                new Sale(50.0, "Books"),
                new Sale(600.0, "Furniture"),
                new Sale(350.0, "Clothing"),
                new Sale(450.0, "Electronics")
        );

        // Total sales amount
        double totalSales = sales.stream()
                .mapToDouble(Sale::getAmount)
                .sum();
        System.out.println("Total Sales Amount: " + totalSales);

        // Average sales for Electronics category
        double averageElectronicsSales = sales.stream()
                .filter(s-> s.getCategory().equals("Electronics"))
                .mapToDouble(Sale::getAmount)
                .average()
                .orElse(0.0);
        System.out.println("Average Electronics Sales: " + averageElectronicsSales);

        // List of sales greater than 300
        List<Sale> highValueSales = sales.stream()
                .filter(s -> s.getAmount() > 300)
                .collect(Collectors.toList());
        System.out.println("Sales Greater Than 300: " + highValueSales);

        sales.stream()
                .filter(s->s.getCategory().equals("Clothing"))
                .forEach(System.out::println);
    }
}
