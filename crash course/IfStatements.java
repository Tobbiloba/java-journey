import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = scanner.nextInt(); // Read an integer from the user

        if (age > 75) {
            System.out.println("Okay boomer");
        } else if (age > 8) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are underage");
        }

        scanner.close();

    }
}
