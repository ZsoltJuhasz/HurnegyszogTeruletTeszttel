import java.util.Scanner;

public class Input {
    static Scanner scanner;

    public Input(){

    }

    public static double input(String message) {
        scanner = new Scanner(System.in);
        System.out.print(message);
        double num = scanner.nextDouble();
        return num;
    }
}