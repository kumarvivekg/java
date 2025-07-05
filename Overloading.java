public class Overloading {
  public static void main(String[] args) {
    fun(54);
    fun("vivek G");

    int ans = sum(3,5);
    System.out.println(ans);
  }
  
  static int sum(int a,int b){
    return a + b;
  }

  static void fun(int a){
    System.out.println(a);
  }
  static void fun(String name){
    System.out.println(name);
  }
}
