
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int loop = 0;
        
        while (loop < name.length()){
            System.out.println((loop + 1) + ". character: " + name.charAt(loop));
            loop++;
        }
    }
}
