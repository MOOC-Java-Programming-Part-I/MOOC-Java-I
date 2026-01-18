public class Cube {
    
    private int length;

    public Cube(int edgeLength){
        this.length = edgeLength;
    }

    public int volume(){
        return (int) Math.pow(this.length, 3);
    }

    public String toString(){
        return "The length of the edge is " + this.length + " and the volume " + this.volume();
    }
}
