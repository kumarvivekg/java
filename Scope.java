public class Scope {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    String name = "vivek";
    {
      // int a = 456;    //already initialized outside the block in the same variable
      a = 234;  //reassign the original ref variable to some other value
      System.out.println(a);
      int c = 566;
      name = "akash";
      System.out.println(name);
      // value initialised in this block, will remain in block
    }
    System.out.println(a);
    System.out.println(name);
    // System.out.println(c);  //cannot use outside

    //scoping in for loops
    for (int i = 0; i < 4; i++) {
      System.out.println(i);
      int num = 90;
      // int a = 10;
    }
    // System.out.println(i);
  }
  static void random(int marks){
    int num = 67;
    System.out.println(num);
    System.out.println(marks);
  }
}
