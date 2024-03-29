import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person (String name){
        this.name = name;
        
        int todayDate = Calendar.getInstance().get(Calendar.DATE);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        
        this.birthday = new MyDate(todayDate, todayMonth, todayYear);
        
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int todayDate = Calendar.getInstance().get(Calendar.DATE);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate today = new MyDate(todayDate, todayMonth, todayYear);
        
        int age = this.birthday.differenceInYears(today);
        return age;
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if (this.age() == compared.age()){
            if (this.birthday.earlier(compared.birthday)){
                return true;
            }
        } else if (this.age() > compared.age()){
            return true;
        }
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
