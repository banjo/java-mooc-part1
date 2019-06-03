
public class Main {

    public static void main(String[] args) {
        Money r1 = new Money(1, 0);
        Money r2 = new Money(1, 50);
        Money r3 = new Money(-3,5);
        Money r4 = new Money(2,0);
        System.out.println(r3.less(r1));
    }
}
