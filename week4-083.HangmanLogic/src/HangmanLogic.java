
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (guessedLetters.contains(letter)){
            
        } else if (word.contains(letter)) {
            guessedLetters += letter;
        } else {
            numberOfFaults++;
            guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        int loop = 0;
        String hiddenWord = "";
        
        while (loop < this.word.length()) {
            char letterc = this.word.charAt(loop);
            String letter = "" + letterc;
            if (guessedLetters.contains(letter)) {
                hiddenWord += letter + " ";
            } else {
                hiddenWord += "_ ";
            }
            loop++;
        }

        // return the hidden word at the end
        return hiddenWord;
    }
}
