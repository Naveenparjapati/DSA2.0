package Comprator_Comprable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    public String toString() {
        return name + " (" + age + ")";
    }

    public int getAge()
    {
    	return age; }
    public String getName()
    { 
    	return name; }
}

public class Comprator_if_else {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 30)
        );

        // Sort by age, then by name  *********************************************************
        people.sort(
            Comparator.comparing(Person::getAge)
                      .thenComparing(Person::getName)
        );

        System.out.println(people);
    }
}
//
//### 🧠 Summary
//
//* Use `comparing()` for custom sorting.
//* Use `thenComparing()` for secondary sorting logic.
//* Use `reversed()` to flip the sort order.
//* Use primitive-specific comparators for performance: `comparingInt`, `comparingDouble`, etc.