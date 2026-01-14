
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(10);
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int num : numbers){
            if(num >= lowerLimit && num <= upperLimit){
                System.out.println(num);
            }
        }
    }
    
}
