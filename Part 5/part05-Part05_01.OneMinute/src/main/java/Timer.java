public class Timer {
    private  ClockHand seconds;
    private final ClockHand milliseconds;

    public Timer(){
        this.seconds = new ClockHand(60);
        this.milliseconds = new ClockHand(100);
    }

    public String toString(){
        return seconds + ":" + milliseconds;
    }

    public void advance(){
        this.milliseconds.advance();

        if(this.milliseconds.value() == 0){
            this.seconds.advance();
        }

    }
}
