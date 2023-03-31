import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {

  public static void main(String args[]) {

    List<String> list1 = new ArrayList(Arrays.asList("Ash", "Ashirvad", "Anshuman", "Andrew", "Basha", "Bala"));
    List<String> list2 = new ArrayList(Arrays.asList("Mantra", "Rahul", "Degga", "Sinduri", "Maasha", "Donald"));
    List<String> list3 = new ArrayList(Arrays.asList("Biden", "Kalpana", "Simham", "Ajju", "Sitara", "Priyanka"));
    List<String> list4 = new ArrayList(Arrays.asList("Trump", "Virat", "Ajay", "Mouli", "Bhosle", "Banu"));

    List<String> resultlist = Stream.of(list1, list2, list3, list4)
        .flatMap(Collection::stream)
        .filter(entry -> entry.startsWith("A"))
        .collect(Collectors.toList());

    resultlist.stream().forEach(System.out::println);
  }

}