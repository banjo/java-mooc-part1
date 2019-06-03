
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        Birdwatcher database = new Birdwatcher(reader);

        while (true) {
            String choice = database.input().toLowerCase();
            
            if (choice.equals("quit")){
                break;
            } else if (choice.equals("add")){
                database.add();
            } else if (choice.equals("observation")){
                database.observation();
            } else if (choice.equals("show")){
                database.show();
            } else if (choice.equals("statistics")) {
                database.statistics();
            }
            
            continue;

        }
    }

}
