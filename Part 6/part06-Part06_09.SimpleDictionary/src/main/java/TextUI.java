
import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){

        while(true){
            System.out.print("Enter a command: ");
            String command = scanner.nextLine().toLowerCase();

            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            } 
            else if(command.equals("add")){
                System.out.print("Word: " );
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            } 
            else if(command.equals("search")){
                System.out.print("To be translated: ");
                String searchedString = scanner.nextLine();
                String wordTranslation = dictionary.translate(searchedString);
                String isFound = wordTranslation == null ? 
                "Word " + searchedString + " was not found" : 
                "Translation: " + dictionary.translate(searchedString);
                System.out.println(isFound);
            } 
            else{
                System.out.println("Unknown command");
            }
        }
    }
}
