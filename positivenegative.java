import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number:- ");
        int number = scanner.nextInt();

        if (number > 50) {
            System.out.println("The number is positive.");
        } else if (number < 50) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
