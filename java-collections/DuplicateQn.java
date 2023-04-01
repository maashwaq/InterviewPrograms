package com.inteview.java.string;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given HashMap of strings, remove duplilcates and sort it in chronological
 * order. For a large dataset with optimized performance
 **/

class DuplicateQn {

  public static void main(String args[]) {

    List<String> list1 = new ArrayList<>(Arrays.asList("Ash", "Ashirvad", "Anshuman", "Andrew", "Basha", "Bala"));
    List<String> list11 = new ArrayList<>(Arrays.asList("Ash", "Ashirvad", "Anshuman", "Andrew", "Basha", "Bala"));
    List<String> list2 = new ArrayList(Arrays.asList("Mantra", "Rahul", "Degga", "Sinduri", "Maasha", "Donald"));
    List<String> list3 = new ArrayList(Arrays.asList("Biden", "Kalpana", "Simham", "Ajju", "Sitara", "Priyanka"));
    List<String> list33 = new ArrayList(Arrays.asList("Biden", "Kalpana", "Simham", "Ajju", "Sitara", "Priyanka"));
    List<String> list4 = new ArrayList(Arrays.asList("Trump", "Virat", "Ajay", "Mouli", "Bhosle", "Banu"));

    List<String> names = Stream.of(list1, list11, list2, list3, list33, list4)
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
    uniqueNames(names).forEach(System.out::println);
  }

  public static ArrayList<String> uniqueNames(List<String> names) {
    return (ArrayList<String>) names.stream().distinct().collect(Collectors.toList());
  }
}

/**
 * -- OUTPUT --
 * C:\iTools\Java\jdk-18.0.1.1\bin\java.exe
 * "-javaagent:C:\iTools\JetBrains\IntelliJ IDEA Community Edition
 * 2022.1.1\lib\idea_rt.jar=53727:C:\iTools\JetBrains\IntelliJ IDEA Community
 * Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -classpath
 * C:\Users\rpash\Downloads\SpringBoot+AutomationTesting\Interviews\out\production\Interviews
 * com.inteview.java.string.DuplicateQn
 * Ash
 * Ashirvad
 * Anshuman
 * Andrew
 * Basha
 * Bala
 * Mantra
 * Rahul
 * Degga
 * Sinduri
 * Maasha
 * Donald
 * Biden
 * Kalpana
 * Simham
 * Ajju
 * Sitara
 * Priyanka
 * Trump
 * Virat
 * Ajay
 * Mouli
 * Bhosle
 * Banu
 *
 * Process finished with exit code 0
 **/