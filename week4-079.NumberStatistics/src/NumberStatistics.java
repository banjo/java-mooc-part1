public class NumberStatistics {
    private int amountOfNumbers = 0;
    private int sum = 0;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        // code here
        if (this.amountOfNumbers != 0){
            return ((double)this.sum / this.amountOfNumbers);
        }  return 0;
    }
}
    