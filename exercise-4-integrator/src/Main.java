import java.util.*;
import java.util.stream.*;
//create a new list with the ages greater than or equal to 18
//multiplied by 2 and ordered
public class Main {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(12, 18, 25, 40, 15, 30, 17, 19);

        List<Integer> agesFiltered = ages.stream()
                .filter(n->n>=18)
                .map(n -> n*2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(agesFiltered);
    }
}
