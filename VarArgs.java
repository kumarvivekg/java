import java.util.Arrays;

public class VarArgs {
  public static void main(String[] args) {
    fun(2,43,5,78,57,8,6,46,7,7,4);
    fun(3,6,"func","dt","rty");
  }
  static void fun(int a,int b,String ...v){
    System.out.println(Arrays.toString(v));
  }
  static void fun(int ...v){
    System.out.println(Arrays.toString(v));
  }
}
