/**
 * y power x
 * 2,1 = 2 ==> true
 * 2,6 = 12 ==> false
 * 5,3 = 125 ==> true
 * 
 **/
class Power {

  public static void main(String args[]) {
    // without using functions
    power(5, 3);
    power(2, 5);
    power(2, 1);
    power(2, 6);
    // using functions
    System.out.println(String.valueOf(Math.pow(5, 2)));
  }

  public static void power(int y, int x) {
    // 2 power 1 = 2
    int factor = 1;
    for (int i = 0; i < x; i++) {
      factor *= y;
    }
    System.out.println(String.valueOf(y) + " power " + String.valueOf(x) + " = " + String.valueOf(factor));
  }

}