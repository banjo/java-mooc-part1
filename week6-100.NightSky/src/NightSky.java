/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

import java.util.Random;

public class NightSky {
    private int width;
    private int height;
    private double density; 
    private int starsInLastPrint;
    
    public NightSky(double density){
        this(density, 20, 10);
    }
    
    public NightSky(int width, int height){
        this(0.1, width, height);
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        starsInLastPrint = 0;
    }
    
    public void printLine(){
        Random rand = new Random();
        
        for (int i = 0; i < this.width; i++){
            double temp = rand.nextDouble();
            
            if (temp < this.density){
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    
    public void print(){
        starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++){
            this.printLine();
        }
    }
    
    public int starsInLastPrint(){
        return starsInLastPrint;
    }
}
