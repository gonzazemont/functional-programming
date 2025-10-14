import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//convert all names to uppercase and save them in another list
public class Main {
    public static void main(String [] args){
        List<String> names = Arrays.asList("ana", "pedro", "juan", "maria", "jose", "luis");

        List<String> namesUppercase = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(namesUppercase);
    }
}
