import logic.Product;
/*
 Product Inventory
Objective: apply groupingBy, counting, mapping.
Description:
* A list of products (Product with name, category and price).
Want:
* Group by category.
* Count how many products there are per category.
* Show the list of names of each group.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.00),
                new Product("Smartphone", "Electronics", 800.00),
                new Product("Desk Chair", "Furniture", 150.00),
                new Product("Dining Table", "Furniture", 300.00),
                new Product("Headphones", "Electronics", 200.00),
                new Product("Bookshelf", "Furniture", 100.00),
                new Product("Monitor", "Electronics", 400.00),
                new Product("Sofa", "Furniture", 500.00),
                new Product("Tablet", "Electronics", 600.00)
        );

        // group by category
        Map <String, List<Product>> productsByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        System.out.println("Products grouped by category:");
        productsByCategory.forEach((category, prods) -> {
            System.out.println(category + ": " + prods);
        });

        // count products per category
        Map <String, Long> productCountByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
        System.out.println("\nProduct count by category:");
        productCountByCategory.forEach((category, count) -> {
            System.out.println(category + ": " + count);
        });

        // list of names per category
        Map <String, List<String>> productNamesByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.mapping(Product::getName, Collectors.toList())));
        System.out.println("\nProduct names by category:");
        productNamesByCategory.forEach((category, names) -> {
            System.out.println(category + ": " + names);
        });

    }
}
