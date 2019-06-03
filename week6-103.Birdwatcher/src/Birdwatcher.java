
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Birdwatcher {

    private Scanner reader;
    ArrayList<Bird> list;

    public Birdwatcher(Scanner reader) {
        this.reader = new Scanner(System.in);
        this.list = new ArrayList<Bird>();

    }

    public String input() {
        while (true) {
            System.out.print("? ");
            String input = reader.nextLine();

            if (input.toLowerCase().equals("statistics") || input.toLowerCase().equals("quit") || input.toLowerCase().equals("add") || input.toLowerCase().equals("observation") || input.toLowerCase().equals("show")) {
                return input;
            }
        }
    }

    public Bird getBird() {
        while (true) {
            System.out.print("Name: ");
            String name = reader.nextLine();

            Bird newBird = new Bird(name);

            System.out.print("Latin name: ");
            String latinName = reader.nextLine();

            newBird.setLatinName(latinName);

            return newBird;
        }
    }

    public void add() {
        Bird bird = this.getBird();
        list.add(bird);

    }

    public void observation() {
        while (true) {
            System.out.print("What was observed? ");
            String name = reader.nextLine();

            for (Bird bird : list) {
                if (name.toLowerCase().equals(bird.getName().toLowerCase())) {
                    bird.observe();
                    return;
                }
            }

            System.out.println("Is not a bird!");
            return;
        }

    }

    public void show() {
        while (true) {
            System.out.print("What? ");
            String name = reader.nextLine();

            for (Bird bird : list) {
                if (name.toLowerCase().equals(bird.getName().toLowerCase())) {
                    System.out.println(bird);
                    return;
                }
            }
            return;
        }
    }

    public void statistics() {
        for (Bird bird : list) {
            System.out.println(bird);
        }
    }

}
