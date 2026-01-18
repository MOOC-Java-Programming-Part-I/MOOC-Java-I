
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        if(this.elements.size() == 0){
            return "The collection " + this.name + " is empty.";
        }

        String text = "The collection " + this.name + " has " + this.elements.size();
        if(this.elements.size() == 1){
            text += " element:\n";
        } else {
            text += " elements:\n";
        }

        String element = String.join("\n", this.elements); 
        return text + element;
    }
    
}
