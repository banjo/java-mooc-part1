
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int power = 0;
        int loop = 0;
        int sum = 0;
        
        while (loop <= number) {
            sum += (int)Math.pow(2, power);
            power++;
            loop++;
            
        }
        
        System.out.println("The result is: " + sum);

    }
}
