package Comprator_Comprable;

public class Comprator_methods {

}
//In Java, the `Comparator<T>` interface provides several **methods** to help define custom sorting logic. These methods are available since Java 8 and are widely used with lambda expressions.


//### ✅ Commonly Used `Comparator` Methods
//
//| Method                              | Description                                  | Example                                                    |
//| ----------------------------------- | -------------------------------------------- | ---------------------------------------------------------- |
//| `compare(T o1, T o2)`               | Compares two objects for order.              | `(a, b) -> a - b`                                          |
//| `reversed()`                        | Reverses the current comparator's order.     | `Comparator.naturalOrder().reversed()`                     |
//| `thenComparing()`                   | Chains a second comparator for tie-breaking. | `comparing(Person::getAge).thenComparing(Person::getName)` |
//| `comparing(Function)`               | Creates a comparator using a key extractor.  | `Comparator.comparing(String::length)`                     |
//| `comparingInt(ToIntFunction)`       | Specialized for `int` return types.          | `comparingInt(Employee::getSalary)`                        |
//| `comparingDouble(ToDoubleFunction)` | Specialized for `double`.                    | `comparingDouble(Product::getPrice)`                       |
//| `comparingLong(ToLongFunction)`     | Specialized for `long`.                      | `comparingLong(Order::getTimestamp)`                       |
//| `naturalOrder()`                    | Comparator for natural ascending order.      | `Comparator.naturalOrder()`                                |
//| `reverseOrder()`                    | Comparator for descending natural order.     | `Comparator.reverseOrder()`                                |
//| `nullsFirst(Comparator)`            | Allows nulls to be sorted first.             | `nullsFirst(comparing(Student::getName))`                  |
//| `nullsLast(Comparator)`             | Allows nulls to be sorted last.              | `nullsLast(comparing(Student::getName))`                   |


