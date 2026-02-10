import java.util.ArrayList;

public class BirdDatabase {
    
    private ArrayList<Bird> birdList;
    private int observations;

    public BirdDatabase(){
        this.birdList = new ArrayList<>();
    }

    public void addBird(Bird bird){
        birdList.add(bird);
    }

    public void observation(String name){
        for(int i = 0; i < birdList.size(); i++){
            if(birdList.get(i).getName().equals(name)){
                birdList.get(i).addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAll(){
        for(Bird bird : birdList){
            System.out.println(bird);
        }
    }

    public void printOne(String name){
        for(int i = 0; i < birdList.size(); i++){
            if(birdList.get(i).getName().equals(name)){
                System.out.println(birdList.get(i));
            }
        }
    }
}
