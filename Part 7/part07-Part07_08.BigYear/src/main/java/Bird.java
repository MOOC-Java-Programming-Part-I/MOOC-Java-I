public class Bird {
    
    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setLatinName(String latinName){
        this.latinName = latinName;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public void addObservation(){
        this.observation++;
    }

    public int getObservation(){
        return this.observation;
    }

    public String toString(){
        return name + " (" + latinName + "): " + observation + " observations";
    }
}
