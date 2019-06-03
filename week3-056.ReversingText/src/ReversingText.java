
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        String help = "";
        int loop = text.length();
        
        while (loop > 0){
            char character = text.charAt(loop-1);
            help = help + character;
            loop--;
        }
        // note that method does now print anything, it RETURNS the reversed string
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
