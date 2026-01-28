import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }

    public int totalWeight(){
        int total = 0;

        for(Gift g : gifts){
            total += g.getWeight();
        }
        return total;
    }
}
