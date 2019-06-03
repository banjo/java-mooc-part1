
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
public class Library {
    private ArrayList<Book> lib;
    
    public Library(){
        this.lib = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        this.lib.add(newBook);
    }
    
    public void printBooks(){
        for (Book theBook : lib){
            System.out.println(theBook);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book book : this.lib){
            if(StringUtils.included(book.title(), title)) {
                found.add(book);
            }
  
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book book : this.lib){
            if(StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book book : this.lib){
            if (book.year() == year){
                found.add(book);
            }
        }
        return found;
    }

    
}
