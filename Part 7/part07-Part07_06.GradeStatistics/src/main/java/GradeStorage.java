import java.util.ArrayList;

public class GradeStorage{

    private ArrayList<Integer> grades;
    private ArrayList<Integer> scores;
    
    public GradeStorage(){
        this.grades = new ArrayList<>();
        this.scores = new ArrayList<>();
    }

    private boolean meetsPassingMinimum(int score){
        return score >= 50;
    }
    
    public void addPointToStorage(int score){
        this.scores.add(score);
        this.grades.add(pointToGrade(score));
    }
    
    public double average(){
        if(scores.size() == 0){
            return -1.0;
        }
        int sum = 0;
        for(Integer score : scores){
            sum += score;
        }

        return (double) sum / scores.size();
    }

    public double averageOfPassingScores(){
        int passSum = 0;
        int passCount = 0;
        for(int i = 0; i < scores.size(); i++){
            if(meetsPassingMinimum(scores.get(i))){
                passSum += scores.get(i);
                passCount++;
            }
        }

        if(passCount == 0 || passSum == 0){
            return -1.0;
        }
        return (double) passSum / passCount;
    }

    public double passPercentage(){
        int passCount = 0;
        for(int i = 0; i < scores.size(); i++){
            if(meetsPassingMinimum(scores.get(i))){
                passCount++;
            }
        }
        return (double) 100.0 * passCount / scores.size();
    }

    public int pointToGrade(int point){
        if(point < 50){
            return 0;
        } else if(point < 60){
            return 1;
        } else if(point < 70){
            return 2;
        } else if(point < 80){
            return 3;
        } else if(point < 90){
            return 4;
        } else{
            return 5;
        }
    }

    public int numberOfGrades(int grade){
        int count = 0;

        for(Integer each : grades){
            if(each == grade){
                count++;
            }
        }
        return count;
    }
}