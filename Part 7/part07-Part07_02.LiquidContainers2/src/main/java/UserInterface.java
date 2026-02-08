import java.util.Scanner;

public class UserInterface {

    private Container container1;
    private Container container2;
    private Scanner scanner;

    public UserInterface(Container c1, Container c2, Scanner scanner){
        this.container1 = c1;
        this.container2 = c2;
        this.scanner = scanner;
    }

    public void start(){
        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0].toLowerCase();
            int amount = Integer.parseInt(parts[1]);

            if(amount < 1){
                continue;
            }

            if(command.equals("add")){
                container1.add(amount);
            }

            else if(command.equals("move")){
                if(amount > container1.contains()){
                    amount = container1.contains();
                }
                
                container2.add(amount);
                container1.remove(amount);
            }

            else if(command.equals("remove")){
                if(container2.contains() - amount >= 0){
                    container2.remove(amount);
                }
            }
        }
    }
}
