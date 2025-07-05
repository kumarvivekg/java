import java.util.Scanner;

public class loop {
  public static void main(String[] args) {
    /*
     * syntax for loop:
     * 
     * for(intiallization; condition; increment/decreme){
     * //body
     * }
     * 
     */

    // print 1 to 5

    // for(int num = 1; num<=5; num++)
    // System.out.println(num);

    // print 1 to n
    // Scanner in = new Scanner(System.in);
    // int n = in.nextInt();

    // for(int num = 1; num<=n; num++){
    // // System.out.println(num + " ");
    // // System.out.println("hello World");
    // }

    /*
     * while loops
     * 
     * syntax:
     * while(condition){
     * //body
     * }
     */

    int num = 1;
    while (num <= 5) {
    System.out.println(num);
    num += 1;
    }

    /*
     * do-while:
     * 
     * do{
     * //body
     * }while(condition);
     */

     int n = 1;
     do {
      System.out.println(n);
      n++;
     } while (n<=5);
  }
}
