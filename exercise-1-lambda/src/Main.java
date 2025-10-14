import java.util.Arrays;
import java.util.List;

//Print each fruit in the format “Fruit: name”.
public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Orange", "Grapes");

        fruits.forEach(n-> System.out.println("Fruit: " + n));
    }
}
