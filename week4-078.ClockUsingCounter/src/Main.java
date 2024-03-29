
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = 50; // read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = 59; // read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = 23; // read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {

            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed

            // like in previous but seconds taken into account
            seconds.next();

            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            i++;
        }

    }
}