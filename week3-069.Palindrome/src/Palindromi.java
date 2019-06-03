import java.util.Scanner;

public class Palindromi {

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
    

    public static boolean palindrome(String text) {
        // write code here
        String newText = reverse(text);
        
        if (text.equals(newText)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
