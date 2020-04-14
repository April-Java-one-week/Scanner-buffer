import java.util.Scanner;

public class ScannerBuffer {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        int userInput;
        int secondInput = 0;
        String name;


        System.out.println("Enter a number");
        userInput = keyboard.nextInt();

        System.out.println("Enter a second number");
        secondInput = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter your name");
        name = keyboard.nextLine();

        System.out.println("First number " + userInput);
        System.out.println("Second number " + secondInput);
        System.out.println("Your name " + name);

    }
}
