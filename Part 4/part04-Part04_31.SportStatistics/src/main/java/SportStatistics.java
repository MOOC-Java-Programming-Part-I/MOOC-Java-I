
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();
        int gameCount = 0;
        int wins = 0;
        int losses = 0;

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.parseInt(parts[2]);
                int visitingPoints = Integer.parseInt(parts[3]);

                if(team.equals(homeTeam) || team.equals(visitingTeam)){
                    gameCount++;
                }
                if(team.equals(homeTeam) && homePoints > visitingPoints){
                    wins++;
                } else if(team.equals(homeTeam) && homePoints < visitingPoints){
                    losses++;
                }
                if(team.equals(visitingTeam) && visitingPoints > homePoints){
                    wins++;
                } else if(team.equals(visitingTeam) && visitingPoints < homePoints){
                    losses++;
                }

            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

        
    }

}
