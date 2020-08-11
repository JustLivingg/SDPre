import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = keyboard.nextInt();
    int num2 = keyboard.nextInt();
    int num3 = keyboard.nextInt();
    double dub1 = keyboard.nextDouble();
    double dub2 = keyboard.nextDouble();
    double dub3 = keyboard.nextDouble();
    int sum = num1 + num2 + num3;
    double total = dub1 + dub2 + dub3;

    System.out.println("Please enter the first whole number you would like to add.");
    System.out.println(num1);
    System.out.println("Please enter the second whole number you would like to add.");
    System.out.println(num2);
    System.out.println("Please enter teh third whole number you would like to add.");
    System.out.println(num3);
    System.out.println("Please enter the first decimal number you would like to add.");
    System.out.println(dub1);
    System.out.println("Please enter the second decimal number you would like to add.");
    System.out.println(dub2);
    System.out.println("Please enter the third decimal number you would like to add.");
    System.out.println(dub3);
    System.out.println("The sum of" + "+" + num1 + "+" + num2 + "+" + num3 + "=" + sum);
    System.out.println("The sum of" + "+" + dub1 + "+" + dub2 + "+" + dub3 + "=" + total);

  }
}
