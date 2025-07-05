public class Shadowing {
  static int x = 90; // this will be shadowed

  public static void main(String[] args) {
    System.out.println(x);
    int x; // this class variable at line 2 shadow by this
    // System.out.println(x); //scope will begin when value is initalised
    x = 40;
    System.out.println(x);
    fun();
  }

  static void fun() {
    System.out.println(x);
  }
}
