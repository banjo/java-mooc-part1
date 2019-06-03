import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();
        
        while (true) {
            System.out.print("Type numbers: ");
            int number = Integer.parseInt(reader.nextLine());
            
            
            if (number == -1) {
                break;
            } else if (number % 2 == 0){
                statsEven.addNumber(number);
                stats.addNumber(number);
            } else {
                statsOdd.addNumber(number);
                stats.addNumber(number);
            }
            
            
        }
        
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even: " + statsEven.sum());
        System.out.println("Sum of odd: " + statsOdd.sum());
    }
    
}
