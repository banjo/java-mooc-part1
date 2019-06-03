import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int loop = 1;
        int sum = 1;
        
        while (loop <= number) {
            sum *= loop;
            loop++;
        }
        
        System.out.println("Factorial is " + sum);

    }
}
