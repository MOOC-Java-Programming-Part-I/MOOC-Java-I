import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner){
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine().toLowerCase();

            if(command.equals("stop")){
                break;
            }

            else if(command.equals("add")){
                System.out.print("To add: ");
                String addTask = scanner.nextLine();
                todo.add(addTask);
            }

            else if(command.equals("list")){
                todo.print();
            }

            else if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int num = scanner.nextInt();
                scanner.nextLine();
                todo.remove(num);
            }
        }
    }
}
