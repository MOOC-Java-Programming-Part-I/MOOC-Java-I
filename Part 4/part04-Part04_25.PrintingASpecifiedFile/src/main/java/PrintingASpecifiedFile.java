
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String userFile = scanner.nextLine();

        try(Scanner pathScanner = new Scanner(Paths.get(userFile))){
            while(pathScanner.hasNextLine()){
                System.out.println(pathScanner.nextLine());
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
