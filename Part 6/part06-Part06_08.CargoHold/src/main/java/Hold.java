import java.util.ArrayList;

public class Hold {
    
    private ArrayList<Suitcase> hold = new ArrayList<>();
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if(currentHoldWeight() + suitcase.totalWeight() <= maxWeight){
            hold.add(suitcase);
        }
    }

    public int currentHoldWeight(){
        int total = 0;

        for (Suitcase eachSuitcase : hold) {
            total += eachSuitcase.totalWeight();
        }
        return total;
    }

    public String toString(){
        if(hold.size() == 0){
            return "No suitcases (" + currentHoldWeight() + " kg)";
        } else if(hold.size() == 1){
            return hold.size() + " suitacase (" + currentHoldWeight() + " kg)";
        }
        return hold.size() + " suitcases (" + currentHoldWeight() + " kg)";
    }

    public void printItems(){
        for(Suitcase eachSuitcase : hold){
            eachSuitcase.printItems();
        }
    }
}
