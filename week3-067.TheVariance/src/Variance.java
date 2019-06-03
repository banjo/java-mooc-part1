import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for (int number : list) {
            sum = sum + number;
        }
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        
        double quant = 0;
        
        for (int item : list) {
            quant++;        
        }
        
        double average = sum / quant;
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double variance = 0;
        double averageList = average(list);
        
        for (int number : list){
            variance = variance + (Math.pow(number - averageList, 2));
        }
        
        variance = variance / (list.size() - 1);
        
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
