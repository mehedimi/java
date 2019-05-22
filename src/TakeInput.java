import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args){

        // Get Scanner instance
        Scanner scanner = new Scanner(System.in);

        // Get String Input

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.println("Thank's " + name);
        // Getting Integer Input
        System.out.print("Now tell us how old are you: ");
        int age = scanner.nextInt();

        System.out.println("WOW! Your age is : "+ age);

        System.out.print("Enter a random float number: ");
        float number = scanner.nextFloat();

        System.out.println("You entered: "+ number);

        System.out.print("Last question! Enter single english letter: ");

        char letter = scanner.next().charAt(0);

        System.out.println("I think your favorite english letter is : "+ letter);

        System.out.println("Thank's for being with us.");

    }
}
