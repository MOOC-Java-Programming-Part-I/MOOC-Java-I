
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        Money newMoney = new Money(this.euros() + addition.euros(), this.cents() + addition.cents());

        return newMoney;

        // return new Money(this.euros() + addition.euros(), this.cents() + addition.cents());
    }

    public boolean lessThan(Money compared){

        return this.euros() < compared.euros() || (this.euros() == compared.euros() && this.cents() < compared.cents());
    }

    public Money minus(Money decreaser){

        // Money newMoney = new Money(this.euros(), this.cents());
        int euroDif = 0;
        int centDif = 0;

        if(this.cents() < decreaser.cents()){
            euroDif = this.euros() - 1 - decreaser.euros();
            /*if(euroDif < 0){
                euroDif = 0;
                centDif = 0;
            } */
           centDif = this.cents() + 100 - decreaser.cents();
        } else if(this.cents() >= decreaser.cents()){
            euroDif = this.euros() - decreaser.euros();
            centDif = this.cents() - decreaser.cents();
        }

        if(euroDif < 0){
            euroDif = 0;
            centDif = 0;
        }
        return new Money(euroDif , centDif);


    }

}
