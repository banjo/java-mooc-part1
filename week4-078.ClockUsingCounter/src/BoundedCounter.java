public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
    }

    public void next(){
        if (this.value == this.upperLimit) {
            this.value = 0;
        } else {
            value++;
        }

    }

    public String toString(){
        if (this.value > 9) {
            return ("" + this.value);
        } else {
            return ("0" + this.value);
        }
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int newValue) {
        if (newValue < 0) {
            this.value = 0;
        } else {
            this.value = newValue;
        }
        
    }
}
