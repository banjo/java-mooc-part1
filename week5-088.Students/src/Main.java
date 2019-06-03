
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while (true){
            System.out.print("name: ");
            String name = reader.nextLine();
            
            if (name.equals("")) {
                System.out.println("");
                break;
            }
            
            System.out.print("studennumber: ");
            String studentNumber = reader.nextLine();
            
            Student student = new Student(name, studentNumber);
            
            list.add(student);
            
        }
        
        for (Student std : list){
            System.out.println(std);
        }
        
        System.out.println("");
        
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");
        System.out.println("");
        
        for (Student std : list) {
            if (std.getName().contains(search)){
                System.out.println(std);
            }
        }
            
        }
}
