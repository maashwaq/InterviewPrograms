/**
 * Java program to compare two strings as parameters and determine if each
 * character exist in one another and return true or else false
 * 
 * Tar , Rat ==> true
 * Tara, Rsta ==> false
 * ping, gniper ==> false
 * abc, cab ==> true
 **/

class CompareStrings {
  public static void main(String[] args) {
    String source = "Star", target = "Sart";
    boolean result = compareTexts(source, target);
    System.out.println(result);

    String source_1 = "Star", target_1 = "Sarte";
    boolean result_1 = compareTexts(source_1, target_1);
    System.out.println(result_1);
  }

  public static boolean compareTexts(String source, String target) {
    for (int i = 0; i < source.length(); i++) {
      System.out.println("source.charAt(i) : " + source.charAt(i));
      System.out.println("target.indexOf(source.charAt(i)) : " + target.indexOf(source.charAt(i)));
      if (target.indexOf(source.charAt(i)) == -1) {
        System.out.println("source.charAt(i) EOF ");
        return false;
      }
    }

    for (int j = 0; j < target.length(); j++) {
      System.out.println("target.charAt(i) : " + target.charAt(j));
      System.out.println("source.indexOf(target.charAt(i)) : " + source.indexOf(target.charAt(j)));
      if (source.indexOf(target.charAt(j)) == -1) {
        System.out.println("target.charAt(j) EOF ");
        return false;
      }
    }

    return true;
  }
}

/**
 * -- OUTPUT --
 *  sh -c javac -classpath .:target/dependency/* -d . $(find . -type f -name
 * '*.java')
 *  java -classpath .:target/dependency/* Main
 * source.charAt(i) : S
 * target.indexOf(source.charAt(i)) : 0
 * source.charAt(i) : t
 * target.indexOf(source.charAt(i)) : 3
 * source.charAt(i) : a
 * target.indexOf(source.charAt(i)) : 1
 * source.charAt(i) : r
 * target.indexOf(source.charAt(i)) : 2
 * target.charAt(i) : S
 * source.indexOf(target.charAt(i)) : 0
 * target.charAt(i) : a
 * source.indexOf(target.charAt(i)) : 2
 * target.charAt(i) : r
 * source.indexOf(target.charAt(i)) : 3
 * target.charAt(i) : t
 * source.indexOf(target.charAt(i)) : 1
 * true
 * source.charAt(i) : S
 * target.indexOf(source.charAt(i)) : 0
 * source.charAt(i) : t
 * target.indexOf(source.charAt(i)) : 3
 * source.charAt(i) : a
 * target.indexOf(source.charAt(i)) : 1
 * source.charAt(i) : r
 * target.indexOf(source.charAt(i)) : 2
 * target.charAt(i) : S
 * source.indexOf(target.charAt(i)) : 0
 * target.charAt(i) : a
 * source.indexOf(target.charAt(i)) : 2
 * target.charAt(i) : r
 * source.indexOf(target.charAt(i)) : 3
 * target.charAt(i) : t
 * source.indexOf(target.charAt(i)) : 1
 * target.charAt(i) : e
 * source.indexOf(target.charAt(i)) : -1
 * target.charAt(j) EOF
 * false
 **/