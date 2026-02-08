public class Container {
    
    private int amount;

    public Container(){
        this.amount = 0;
    }

    public int contains(){
        return amount;
    }

    public void add(int value){
        if(value > 0){
            if(this.amount + value > 100){
                this.amount = 100;
            } else{
                this.amount += value;
            }
        }
    }

    public void remove(int value){
        if(value > 0){
            if(this.amount - value < 0){
                this.amount = 0;
            } else{
                this.amount -= value;
            }
        }
    }

    public String toString(){
        return this.amount + "/100";
    }
}
