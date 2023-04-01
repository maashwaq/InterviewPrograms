import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FlatMapQn {

  public static void main(String args[]) {

    List<String> list1 = new ArrayList<>(Arrays.asList("Ash", "Ashirvad", "Anshuman", "Andrew", "Basha", "Bala"));
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

/**
 * -- OUTPUT --
 * 
 *  sh -c javac -classpath .:target/dependency/* -d . $(find . -type f -name
 * '*.java')
 * Note: Some input files use unchecked or unsafe operations.
 * Note: Recompile with -Xlint:unchecked for details.
 *  java -classpath .:target/dependency/* Main
 * Ash
 * Ashirvad
 * Anshuman
 * Andrew
 * Ajju
 * Ajay
 *  ^C
 * 
 * 
 **/