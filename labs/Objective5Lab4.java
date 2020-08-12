import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    System.out.println("Please enter a number:");
    System.out.println(num);

    if(num % 2 == 0) {
      System.out.println("The number is even.");
    }
    if(num % 2 == 1) {
      System.out.println("The number is odd.");
    }
    scanner.close();
  }
}
