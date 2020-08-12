import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum = scanner.nextInt();

      System.out.println("Please enter a number: ");
      System.out.println(userNum);

      if(userNum > 0) {
        System.out.println("The number is positive");
      }
      if(userNum < 0) {
        System.out.println("The number is negative");
      }
      if(userNum == 0) {
        System.out.println("The number is 0");
      }


      /*
        Your solution goes here
      */

      scanner.close();
  }
}
