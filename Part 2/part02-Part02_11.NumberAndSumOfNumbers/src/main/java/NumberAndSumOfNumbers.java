
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int amountOfNumbers = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userInput = scanner.nextInt();
            
            if (userInput == 0) {
                break;
            } else {
                sum = sum + userInput;
                amountOfNumbers++;
            } 
        }
        System.out.println("Number of numbers: " + amountOfNumbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}
