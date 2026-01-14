
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for? ");
        int searches = scanner.nextInt();
        
        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            if (number == searches){
                System.out.println(searches + " is at index " + i);
            }
            
        }
    }
}
