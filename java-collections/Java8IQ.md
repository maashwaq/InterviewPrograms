**What is a lambda expression in Java 8? Can you provide an example?**

A lambda expression is a concise way to represent a functional interface using a single method. It allows you to pass behavior as an argument to a method, and can improve code readability and maintainability.

List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(name -> System.out.println(name));

**What is the difference between the map() and flatMap() methods in Java 8 streams? Can you provide an example?**

The map() method applies a function to each element of a stream and returns a new stream with the transformed elements. 

The flatMap() method applies a function to each element of a stream that returns a stream of values,
and returns a flattened stream of those values.

List<List<Integer>> numbers = Arrays.asList(
    Arrays.asList(1, 2, 3),
    Arrays.asList(4, 5, 6),
    Arrays.asList(7, 8, 9)
);

// Using map()
List<Integer> flattenedMap = numbers.stream()
    .map(list -> list.stream())
    .flatMap(stream -> stream)
    .collect(Collectors.toList());

// Using flatMap()
List<Integer> flattenedFlatMap = numbers.stream()
    .flatMap(list -> list.stream())
    .collect(Collectors.toList());

In the example above, flattenedMap and flattenedFlatMap contain the same flattened list of integers.

**What are default methods in interfaces in Java 8? Can you provide an example?**

Default methods in interfaces are methods that provide a default implementation that can be overridden by implementing classes. They allow interfaces to evolve without breaking existing implementations.

public interface Greeting {
    default void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class FormalGreeting implements Greeting {
    @Override
    public void greet(String name) {
        System.out.println("Good morning, " + name + "!");
    }
}

public class Example {
    public static void main(String[] args) {
        Greeting informalGreeting = new Greeting() {};
        informalGreeting.greet("Alice");

        Greeting formalGreeting = new FormalGreeting();
        formalGreeting.greet("Bob");
    }
}

In the example above, the Greeting interface defines a default greet() method that prints an informal greeting. The FormalGreeting class extends Greeting and overrides the greet() method to print a formal greeting. The Example class demonstrates using both the Greeting interface and the FormalGreeting class to print different greetings.
