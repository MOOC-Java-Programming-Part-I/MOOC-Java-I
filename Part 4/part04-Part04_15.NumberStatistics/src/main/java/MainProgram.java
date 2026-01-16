
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers:");

        Statistics allStats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();

        while(true){
            int userInput = scanner.nextInt();
            if(userInput == -1){
                break;
            }
            
            allStats.addNumber(userInput);
            if(userInput % 2 == 0){
                evenStats.addNumber(userInput);
            }
            if(userInput % 2 == 1){
                oddStats.addNumber(userInput);
            }
        }
        System.out.println("Sum: " + allStats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());

        scanner.close();
    }
}
