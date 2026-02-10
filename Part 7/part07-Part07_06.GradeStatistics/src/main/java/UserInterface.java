    import java.util.Scanner;

    public class UserInterface {
        
        private Scanner scanner;
        private GradeStorage gradeStorage;

        public UserInterface(Scanner scanner, GradeStorage gradeStorage){
            this.scanner = scanner;
            this.gradeStorage = gradeStorage;
        }

        public void start(){
            System.out.println("Enter point totals, -1 stops");
            while(true){
                int input = Integer.valueOf(scanner.nextLine());

                if(input == -1){
                    break;
                }

                int points = Integer.valueOf(input);

                if(points < 0 || points > 100){
                    continue;
                }

                this.gradeStorage.addPointToStorage(points);
            }

            System.out.println("Point average (all): " + gradeStorage.average());
            printAvgeragesAndPercentage();
            printGradeDistribution();
        }

        public void printAvgeragesAndPercentage(){
            if(gradeStorage.averageOfPassingScores() == -1.0){
                System.out.println("Point average (passing): -");
                System.out.println("Pass percentage: 0.0");
            } else {
                System.out.println("Point average (passing): " + gradeStorage.averageOfPassingScores());
                System.out.println("Pass percentage: " + gradeStorage.passPercentage());
            }
        }

        public void printGradeDistribution(){
            System.out.println("Grade Distribution:");
            int grade = 5;
            while(grade >= 0){
                int stars = gradeStorage.numberOfGrades(grade);
                System.out.print(grade + ": ");
                for(int i = 0; i < stars; i++){
                    System.out.print("*");
                }
                System.out.println();
                grade--;
            }
        }
    }
