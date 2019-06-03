
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        Money newMoney = new Money(this.euros + added.euros, this.cents + added.cents);
        return newMoney;
    }
    
    public boolean less(Money compared){
        if (this.euros == compared.euros){
            if (this.cents < compared.cents){
                return true;
            }
            return false;

        } else if (this.euros < compared.euros){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented){
        
        int currentEuro = this.euros * 100;
        int decrementedEuro = decremented.euros * 100;
        int currentCents = this.cents;
        int decrementedCents = decremented.cents;
        
        int newEuro;
        int newCents;
        
        newEuro = currentEuro - decrementedEuro - 1;
        newCents = currentCents - (decrementedCents - 100);
        
        if (currentEuro < decrementedEuro){
            newEuro = 0;
            newCents = 0;
        }
        
        newEuro = newEuro / 100;
        
        Money newMoney = new Money(newEuro, newCents);
            
        return newMoney;
    }

}
