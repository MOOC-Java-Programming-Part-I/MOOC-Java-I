
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};
        
        System.out.println("Enter username: ");
        String username1 = scanner.nextLine();
        System.out.println("Enter password: ");
        String password1 = scanner.nextLine();
        
        if(username1.equals(username[0]) && password1.equals(password[0]) || username1.equals(username[1]) && password1.equals(password[1])) 
                System.out.println("You have successfully logged in!");
        else System.out.println("Incorrect username or password!");
    }
}
