import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int loop = 0;
        while (loop < 3) {
            if (name.length() < 3){
                break;
            }
            System.out.println((loop + 1) + ". character: " + name.charAt(loop));
            loop++;
        }
    }
}
