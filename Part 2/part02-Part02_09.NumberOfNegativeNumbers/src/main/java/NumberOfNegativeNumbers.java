
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int negatives = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0) {
                break;
            }
            if (userInput < 0) {
                negatives++;
            }
        }
        System.out.println("Number of negative numbers: " + negatives);

    }
}
