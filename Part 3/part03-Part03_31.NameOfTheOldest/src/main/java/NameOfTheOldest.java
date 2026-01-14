import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldestPerson = "";
        int oldestAge = -1;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());

            if (age > oldestAge) {
                oldestAge = age;
                oldestPerson = name;
            }

        }
        System.out.println(oldestPerson);
        scanner.close();

    }
}
