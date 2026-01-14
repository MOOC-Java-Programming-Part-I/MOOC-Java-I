
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            String currentName = parts[0].trim();
            names.add(currentName);
            int currentYear = Integer.parseInt(parts[1].trim());
            years.add(currentYear);

        }

        String longestName = "";
        int sum = 0;

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > longestName.length()) {
                longestName = names.get(i);
            }
        }

        for (int i = 0; i < years.size(); i++) {
            sum += years.get(i);
        }

        double averageYear = (double) sum / years.size();
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageYear);
        scanner.close();
    }
}
