
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String filePath = scanner.nextLine();

        ArrayList<Recipe> recipes = readRecipesFromFile(filePath);

        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient\n");

        while(true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine().toLowerCase();

            if(command.equals("stop")){
                break;
            }

            if(command.equals("list")){
                listRecipes(recipes);
            }

            if(command.equals("find name")){
                findByName(scanner, recipes);
            }

            if(command.equals("find cooking time")){
                findByCookingTime(scanner, recipes);
            }

            if(command.equals("find ingredient")){
                findByIngredient(scanner, recipes);
            }
        }
    }

    public static ArrayList<Recipe> readRecipesFromFile(String filePath){

        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> fileLines = new ArrayList<>();

        try(Scanner fileScanner = new Scanner(Paths.get(filePath))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                fileLines.add(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int i = 0;
        while(i < fileLines.size()){
            String recipeName = fileLines.get(i);
            int time = Integer.valueOf(fileLines.get(i+1));
            i +=2;
            ArrayList<String> currentIngredients = new ArrayList<>();

            while(i < fileLines.size() && !fileLines.get(i).isEmpty()){
                currentIngredients.add(fileLines.get(i));
                i++;
            }
            recipes.add(new Recipe(recipeName, time, currentIngredients));
            i++;
        }
        
        return recipes;
    }

    public static void listRecipes(ArrayList<Recipe> recipes){
        System.out.println("\nRecipes:");
        for(int j = 0; j < recipes.size(); j++){
            System.out.println(recipes.get(j));
        }
        System.out.println();
    }

    public static void findByName(Scanner scanner, ArrayList<Recipe> recipes){
        System.out.print("Searched word: ");
        String search = scanner.nextLine().toLowerCase();

        System.out.println("\nRecipes:");
        for(int j = 0; j < recipes.size(); j++){
            String name = recipes.get(j).getName().toLowerCase();
            if(name.contains(search)){
                System.out.println(recipes.get(j));
            }
        }
        System.out.println();
    }

    public static void findByCookingTime(Scanner scanner, ArrayList<Recipe> recipes){
        System.out.print("Max Cooking Time: ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        System.out.println("\nRecipes: ");
        for(int j = 0; j < recipes.size(); j++){
            int cTime = recipes.get(j).getCookingTime();
            if(cTime <= maxTime){
                System.out.println(recipes.get(j));
            }
        }
        System.out.println();
    }

    public static void findByIngredient(Scanner scanner, ArrayList<Recipe> recipes){
        System.out.print("Ingredient: ");
        String ingredientToSearch = scanner.nextLine();

        System.out.println("\nRecipes:");
        for(int j = 0; j < recipes.size(); j++){
            if(recipes.get(j).getIngredients().contains(ingredientToSearch)){
                System.out.println(recipes.get(j));
            }
        }
        System.out.println();
    }
}