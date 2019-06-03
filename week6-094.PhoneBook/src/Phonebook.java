
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Phonebook {
    private ArrayList<Person> phonelist = new ArrayList<Person>();
    
    public void add(String name, String number){
        Person person = new Person(name, number);
        phonelist.add(person);
    }
    
    public void printAll(){
        for (Person name : phonelist){
            System.out.println(name);
        }
    }
    
    public String searchNumber(String name){
        for (Person person : phonelist){
            if (name.equals(person.getName())){
                return person.getNumber();
            } 
        }
        
        return "number not known";
    }
}
