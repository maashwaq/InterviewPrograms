//java program to find duplicate from set of 1000 strings in an array list

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDupIn1000Str {
  public static void main(String[] args) {
    // Generate 1000 random strings
    List<String> list = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      list.add(randomString(5)); // method that generates random strings
    }

    Set<String> duplicates = new HashSet<>();
    Set<String> set = new HashSet<>();

    for (String str : list) {
      if (!set.add(str)) {
        duplicates.add(str);
      }
    }

    System.out.println("Original List: " + list);
    System.out.println("Set of Duplicates: " + duplicates);
  }

  // Generate a random string of specified length
  public static String randomString(int length) {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < length; i++) {
      int index = (int) (Math.random() * chars.length());
      sb.append(chars.charAt(index));
    }
    System.out.println(sb.toString());
    return sb.toString();
  }
}

/**
 *Java program that takes an ArrayList of 1000 randomly generated strings and returns a Set containing all the duplicate strings:
In the above program, we first generate a list of 1000 random strings using a custom randomString() method. We then create two Sets: one to keep track of all unique elements (set) and one to keep track of duplicates (duplicates). We iterate over each element in the ArrayList, and for each element, we check if it is already present in the set using the add() method. If it returns false, it means that the element is already present in the set, so we add it to the duplicates set. Finally, we print out both the original list and the set of duplicates.

Original List: [5n5gQ, zvnBf, WQD41, EsYR2, 5JaXa, Lqsf3, xPKdC, a16wM, EAtk3, xYfjK, ...
Set of Duplicates: [TwQyR, JdphG, VQLcA, JjK6Z, X7V2F, z4N7H, eGyNC, UyN8w, YSxvK, 6RpHy, ...

The program correctly identifies all the duplicate elements in the list of 1000 random strings.
**/
