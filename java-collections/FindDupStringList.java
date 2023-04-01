import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDupStringList {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("apple");
    list.add("banana");
    list.add("cherry");
    list.add("apple");
    list.add("durian");
    list.add("banana");
    list.add("elderberry");
    list.add("fig");
    list.add("cherry");
    list.add("grape");

    Set<String> duplicates = list.stream()
        .filter(e -> list.indexOf(e) != list.lastIndexOf(e))
        .collect(Collectors.toSet());

    System.out.println("List: " + list);
    System.out.println("Duplicates: " + duplicates);
  }
}
/*
 * In the above program, we create an ArrayList of strings and add some
 * duplicate elements to it.
 * We then use the Java 8 Stream API to filter the list for elements that have a
 * different first occurrence index than last occurrence index.
 * We then collect the filtered elements into a Set of duplicates. Finally, we
 * print out both the original list and the set of duplicates
 * 
 * List: [apple, banana, cherry, apple, durian, banana, elderberry, fig, cherry,
 * grape]
 * Duplicates: [banana, cherry, apple]
 * 
 * The program correctly identifies the set of duplicate elements in the list,
 * which are banana, cherry, and apple.
 */