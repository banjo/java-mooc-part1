
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Second: ");
        int second = Integer.parseInt(reader.nextLine());
        
        int loop = 0;
        int sum = 0;
        
        while (first <= second) {
            sum += first;
            first++;
        }
        
        System.out.println("The sum is: " + sum);
    }
}
