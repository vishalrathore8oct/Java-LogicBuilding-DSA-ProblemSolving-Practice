import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Java world!");
        System.out.print("Please enter your name: ");

        String name = input.nextLine();
        System.out.println("Hello, " + name + " Ji !");
    }
}