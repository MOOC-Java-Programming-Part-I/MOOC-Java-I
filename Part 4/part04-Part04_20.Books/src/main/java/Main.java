import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while(true){
            System.out.print("Title: ");
            String bTitle = scanner.nextLine();

            if(bTitle.isEmpty()){
                break;
            }

            System.out.print("Pages: ");
            int bPages = Integer.valueOf(scanner.nextLine());
            

            System.out.print("Publication year: ");
            int bYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bTitle, bPages, bYear));
        }

        System.out.print("What information will be printed? ");
        String valueToPrint = scanner.nextLine().toLowerCase();
        
        

        if(valueToPrint.equals("everything")){
            for(Book book : books){
                System.out.println(book.toString());
            }
        } else if (valueToPrint.equals("name")){
            for(Book book : books){
                System.out.println(book.getTitle());
            }
        }

        scanner.close();
    }
}
