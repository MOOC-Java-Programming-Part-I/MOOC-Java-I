import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
        if(!(totalWeight() + item.getWeight() > this.maxWeight)){
            items.add(item);
        }
    }

    public int totalWeight(){
        int sum = 0;

        for(Item eachItem : items){
            sum += eachItem.getWeight();
        }
        return sum;
    }

    public String toString(){
        if(items.size() == 0){
            return "no items (" + totalWeight() + " kg)";
        } else if(items.size() == 1){
            return items.size() + " item (" + totalWeight() + " kg)";
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }

    public void printItems(){
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem(){

        if(items.size() == 0) return null;

        Item heaviestItem = items.get(0);
        int heaviest = items.get(0).getWeight();

        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getWeight() > heaviest){
                heaviest = items.get(i).getWeight();
                heaviestItem = items.get(i);
            }
        }

        return heaviestItem;
    }
}
