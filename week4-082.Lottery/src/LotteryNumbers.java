import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        
        numbers.clear();
        
        int loop = 0;
        
        while (loop < 7){
            int randint = random.nextInt(39);
            randint++;
            
            if (containsNumber(randint)) {
                continue;
            }
            
            numbers.add(randint);
            loop++;
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (numbers.contains(number)){
            return true;
        }
        return false;
    }
}
