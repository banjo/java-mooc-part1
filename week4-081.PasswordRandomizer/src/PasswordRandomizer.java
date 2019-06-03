import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int loop = 0;
        String password = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        while (loop < length) {
            int randint = random.nextInt(26);
            //randint++; 
            
            char symbol = alphabet.charAt(randint);
            password = password + symbol;
            loop++;
            
        }
        return password;
    }
}
