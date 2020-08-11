import java.util.Scanner; //imports the scanner

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = keyboard.nextLine();
    String lname = keyboard.nextLine();
    String favoriteAnimal = keyboard.nextLine();
    String favoriteFood = keyboard.nextLine();
    String favoriteSong = keyboard.nextLine();

    System.out.println("What is your first name?");
    System.out.println(fname);
    System.out.println("What is your last name?");
    System.out.println(lname);
    System.out.println("What is your favorite animal?");
    System.out.println(favoriteAnimal);
    System.out.println("What is your favorite song?");
    System.out.println(favoriteSong);
    System.out.println("My name is " + fname + lname);
    System.out.println("My favorite animal is the " + favoriteAnimal);
    System.out.println("My favorite food is " + favoriteFood);
    System.out.println("My favorite song is " + favoriteSong);
  }
}
