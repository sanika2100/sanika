import java.util.Scanner;

public class traficlights{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter traffic light color (red, yellow, green): ");
        String color = scanner.next().toLowerCase();
        
        String message;
        
        switch (color) {
            case "red":
                message = "Stop";
                break;
            case "yellow":
                message = "Get Ready";
                break;
            case "green":
                message = "Go";
                break;
            default:
                message = "NO any message.";
        }
        System.out.println(message);
    }
}

