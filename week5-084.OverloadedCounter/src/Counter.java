/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Counter {
    int count;
    boolean check;
    
    public Counter(int startingValue) {
        this.count = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check) {
        this.count = 0;
        this.check = check;
    }
    
    public Counter(){
        this.count = 0;
        this.check = false;
    }
    
    public Counter(int startingValue, boolean check){
        this.count = startingValue;
        this.check = check;
    }
    
    public int value(){
        return this.count;
    }
    
    public void increase(){
        this.count++;
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
            return;
        }
        this.count += increaseAmount;
    }
    
    public void decrease(){
        if (this.check == false) {
            this.count--;
        } else {
            if (this.count > 0) {
                this.count--;
            }
        }
 
    }
    
    public void decrease(int decreaseAmount){
        
        if (decreaseAmount < 0) {
            return;
        }
        
        if (this.check == false) {
            this.count -= decreaseAmount;
        } else {
            if (this.count < decreaseAmount) {
                this.count = 0; 
            }
        }
    }
    
}
