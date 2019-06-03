
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double economicalLunch = 2.5;
    private static final double gourmetLunch = 4;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        
        if (cashGiven < this.economicalLunch){
            return cashGiven;
        }
        
        this.economicalSold++;
        this.cashInRegister += this.economicalLunch;
        return cashGiven - this.economicalLunch;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven < this.gourmetLunch){
            return cashGiven;
        }
        
        this.gourmetSold++;
        this.cashInRegister += this.gourmetLunch;
        return cashGiven - this.gourmetLunch;
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        
        if (card.balance() >= this.economicalLunch){
            this.economicalSold++;
            card.pay(this.economicalLunch);
            return true;
        } return false;
        
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        
        if (card.balance() >= this.gourmetLunch){
            this.gourmetSold++;
            card.pay(this.gourmetLunch);
            return true;
        } return false;
        
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum){
        
        if (sum < 0) {
            return;
        }
        
        this.cashInRegister += sum;
        card.loadMoney(sum);
    }
}
