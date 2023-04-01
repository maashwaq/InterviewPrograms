
/** we have array list of n number of strings i want set of strings to find duplicates
ArrayList of strings and returns a Set containing all the duplicate strings:
To find duplicates in a set of strings from an ArrayList in Java, you can follow these steps:

Create a new HashSet to store unique strings.
Loop through each string in the ArrayList.
Check if the HashSet already contains the current string.
If the HashSet already contains the string, then it is a duplicate. Print or add the string to a new ArrayList containing duplicates.
If the HashSet does not contain the string, add it to the HashSet.

**/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("apple");
    list.add("banana");
    list.add("cherry");
    list.add("apple");
    list.add("durian");
    list.add("banana");

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
}

/*
 * In the above program, we create an ArrayList of strings and add some
 * duplicate elements to it. We then create two Sets: one to keep track of all
 * unique elements (set) and one to keep track of duplicates (duplicates). We
 * iterate over each element in the ArrayList, and for each element, we check if
 * it is already present in the set using the add() method. If it returns false,
 * it means that the element is already present in the set, so we add it to the
 * duplicates set. Finally, we print out both the original list and the set of
 * duplicates.
 * 
 * Original List: [apple, banana, cherry, apple, durian, banana]
 * Set of Duplicates: [banana, apple]
 * 
 * The program correctly identifies the two duplicate elements in the list,
 * which are banana and apple.
 * 
 */
