
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        
        int loop = 0;
        int sum = 0;
        
        while (loop < number) {
            loop++;
            sum += loop;
        }
        
        System.out.println("Sum is " + sum);
        

    }
}
