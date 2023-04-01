package com.inteview.java.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given HashMap of strings, remove duplilcates and sort it in chronological
 * order. For a large dataset with optimized performance
 * 
 * 
 * To remove duplicates and sort a HashMap of strings in chronological order,
 * you can follow the below steps:
 * 
 * Create a TreeMap with key as the date string and value as the corresponding
 * string from the HashMap. TreeMap will automatically sort the entries by date.
 * 
 * Iterate over the HashMap and for each entry, extract the date string and add
 * it as a key-value pair in the TreeMap. If the date string already exists in
 * the TreeMap, skip that entry.
 * 
 * Once all the entries have been processed, iterate over the TreeMap to extract
 * the values and add them to a new ArrayList.
 * 
 * Return the ArrayList containing the sorted strings.
 * 
 * This code uses a TreeMap to sort the entries and avoid duplicate keys. The
 * values from the TreeMap are then added to a new ArrayList in the order of
 * their keys.
 * 
 * This method has a time complexity of O(n log n) due to the use of
 * TreeMap, but this is still optimized for large datasets.
 **/

class SortMapQn {

  public static void main(String args[]) {

    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("a", "ashirvadam");
    hashMap.put("b", "ashitosh");
    hashMap.put("d", "sunaina");
    hashMap.put("d", "Sampoornam");
    hashMap.put("a", "alekhya");
    sortHashMap(hashMap);
  }

  public static ArrayList<String> sortHashMap(HashMap<String, String> map) {
    TreeMap<String, String> treeMap = new TreeMap<>();
    for (Map.Entry<String, String> entry : map.entrySet()) {
      String key = entry.getKey();
      String value = entry.getValue();
      if (!treeMap.containsKey(key)) {
        treeMap.put(key, value);
      }
    }
    ArrayList<String> sortedList = new ArrayList<>(treeMap.values());
    sortedList.forEach(System.out::println);
    return sortedList;
  }
}

/**
 * -- OUTPUT --
 *  sh -c javac -classpath .:target/dependency/* -d . $(find . -type f -name
 * '*.java')
 * Note: ./java-collections/SortMapQn.java uses unchecked or unsafe operations.
 * Note: Recompile with -Xlint:unchecked for details.
 *  java -classpath .:target/dependency/* Main
 * Ash
 * Ashirvad
 * Anshuman
 * Andrew
 * Ajju
 * Ajay
 * 
 **/