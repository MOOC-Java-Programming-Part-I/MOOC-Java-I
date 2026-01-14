
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //number refers to the count of the userInput
        int number = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number: ");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0) {
                break;
            } else if (userInput < 0) {
                continue;
            } else {
                number++;
                sum += userInput;
            }
        }
        if (number == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / number;
            System.out.println(average);
        }
        
    }
}
