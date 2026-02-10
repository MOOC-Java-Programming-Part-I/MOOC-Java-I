
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStorage storage = new GradeStorage();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        UserInterface ui = new UserInterface(scanner, storage);
        ui.start();
    }
}
