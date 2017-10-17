
import java.util.Scanner;

public class App {

    public static void main(String... args) {

        System.out.println("Please write your name... ");

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        Person person = new Person(userInput);

        if(userInput.equalsIgnoreCase("Alice") || (userInput.equalsIgnoreCase("Bob"))){

            System.out.println("Hello "+ person.toString() + " Welcome to zipCode...");

        }else

            System.out.println(userInput + " you're not welcome in our BootCamp, get out");

    }
}

