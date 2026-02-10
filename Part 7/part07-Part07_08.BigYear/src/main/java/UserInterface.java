import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private BirdDatabase birdDB;

    public UserInterface(Scanner scan, BirdDatabase birdDB){
        this.scanner = scan;
        this.birdDB = birdDB;
    }

    public void start(){

        while(true){
            System.out.print("? ");
            String command = scanner.nextLine();

            if(command.equals("Quit")){
                break;
            }

            if(command.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in latin: ");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                birdDB.addBird(bird);
            }

            if(command.equals("Observation")){
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                birdDB.observation(birdName);
            }

            if(command.equals("All")){
                birdDB.printAll();
            }

            if(command.equals("One")){
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                birdDB.printOne(birdName);
            }
        }
    }
}
