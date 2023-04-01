import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * To find duplicates in a set of strings from a HashMap in Java, you can follow
 * a similar approach as the one used for ArrayList. However, instead of looping
 * through the ArrayList, you would loop through the values in the HashMap.
 * 
 * Here is an example Java code that demonstrates how to find duplicates in a
 * set of strings from a HashMap:
 * 
 * In this example, the HashMap contains five entries, including two duplicates
 * ("apple" and "banana"). The code loops through each value in the HashMap and
 * checks if it is already in the HashSet. If the string is already in the
 * HashSet, then it is a duplicate and is added to the duplicates HashSet. After
 * the loop finishes, the duplicates HashSet is printed to the console.
 * 
 */

public class FindDuplicateStringsFromHashMap {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "apple");
    map.put(2, "banana");
    map.put(3, "cherry");
    map.put(4, "apple");
    map.put(5, "banana");

    Set<String> set = new HashSet<>();
    Set<String> duplicates = new HashSet<>();

    for (String str : map.values()) {
      if (!set.add(str)) {
        duplicates.add(str);
      }
    }

    System.out.println("Original HashMap: " + map);
    System.out.println("Duplicate strings: " + duplicates);
  }
}
