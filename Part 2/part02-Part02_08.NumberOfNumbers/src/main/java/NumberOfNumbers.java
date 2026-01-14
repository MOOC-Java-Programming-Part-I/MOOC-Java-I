
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int userInput = Integer.valueOf(scanner.nextLine());
             
            if (!(userInput == 0)) {
                numbers++;
            }
            if (userInput == 0) {
                break;
            }
        }
        System.out.println("Number of numbers: " + numbers);

    }
}
