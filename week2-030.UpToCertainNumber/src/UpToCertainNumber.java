
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.print("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        int loop = 1;
        
        while (loop <= number) {
            System.out.println(loop);
            loop++;
        }
    }
}
