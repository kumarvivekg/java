import java.util.Scanner;

public class switchcase {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String frute = in.next();

    switch (frute) {
      case "mango" -> System.out.println("king of fruit");
      case "apple" -> System.out.println("a sweet red fruit");
      default -> System.out.println("please enter valid fruit");
    }
  }
}
