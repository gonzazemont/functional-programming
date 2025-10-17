/*
Objective: practice map, filter, sorted, forEach.
Description:
*You have a list of names, and you want to:
*Filter those that start with a specific letter.
*Convert them to uppercase.
*Sort them.
*Print them.
 */

import logic.Person;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30, "New York"),
            new Person("Bob", 25, "Los Angeles"),
            new Person("Charlie", 35, "Chicago"),
            new Person("Anna", 28, "Miami"),
            new Person("David", 40, "Seattle"),
            new Person("Amanda", 22, "Boston")
        );

        people.stream()
            .map(Person::getName)
                .filter(p-> p.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
