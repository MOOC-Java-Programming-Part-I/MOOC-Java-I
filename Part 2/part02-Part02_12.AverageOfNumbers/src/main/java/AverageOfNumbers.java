
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double average = 0.0;
        int number = 0;
        int sumOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int userInput = scanner.nextInt();
        
            if (userInput == 0) {
                break;
            } else {
                number++;
                sumOfNumbers = sumOfNumbers + userInput;
            }
        } 
        average = (double) sumOfNumbers / number;
        System.out.println("Average of the numbers: " + average);
        
    }
}
