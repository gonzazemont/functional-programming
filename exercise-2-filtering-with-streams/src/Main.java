import java.util.Arrays;
import java.util.List;

//display only numbers greater than 5 using Streams
//Extra: try sorting them before printing
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 8, 13, 2, 10, 7, 1, 26, 3, 14);

        numbers.stream()
                .filter(n -> n > 5)
                .sorted()
                .forEach(System.out::println);
    }
}
