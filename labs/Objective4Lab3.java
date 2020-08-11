import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int currentYear = 2020;
    int birthYear = 1993;
    int age = keyboard.nextInt();

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    System.out.println(age);

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
