
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        if (this.month == 12 && this.day == 30){
            this.year++;
            this.month = 1;
            this.day = 0;
        }
        
        if (this.day == 30) {
            this.month++;
            this.day = 0;
        }
        
        this.day++;
    }
    
    public void advance(int numberOfDays){
        int loop = numberOfDays;
        
        while (loop > 0){
            this.advance();
            loop--;
        }
    }
    
    public MyDate afterNumberOfDays(int days){
        MyDate newMyDate = new MyDate(day, month, year);
        newMyDate.advance(days);
        return newMyDate;
       
    }

}
