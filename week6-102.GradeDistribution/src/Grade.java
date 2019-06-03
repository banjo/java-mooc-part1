
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Grade {
    private Scanner reader;
    private int score0;
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int score5;
    private int accepted;
    private int total;
    
    public Grade(Scanner reader){
        this.reader = new Scanner(System.in);
        
    }
    
    public void getGrade(){
        System.out.println("Type exam scores, -1 completes: ");
        while (true){
            int grade = Integer.parseInt(reader.nextLine());

            if (grade == 0){
                continue;
            }
            
            if (grade == -1){
                return;
            }
            
            if (grade < 0 || grade > 60){
                continue;
            }

            
            this.total++;
            this.calculate(grade);
            
            
        }
        // System.out.println("");
    }
    
    public void printGrade(){
        System.out.println("Grade distribution:");
        
        for (int i = 5; i >= 0; i--){
            System.out.print("" + i + ": ");
            
            int score = chooseScore(i);
            for (int j = 0; j < score; j++){
                System.out.print("*");
            }
            
            
            System.out.println("");
        }
        
        System.out.print("Acceptance percentage: ");
        System.out.print(this.calcAccepted());
        System.out.println("");
        
    }
    
    private void calculate(int grade){
        if (grade >= 0 && grade <= 29) {
            this.score0++;
        } else if (grade >= 30 && grade <= 34) {
            this.score1++;
            this.accepted++;
        } else if (grade >= 35 && grade <= 39) {
            this.score2++;
            this.accepted++;
        } else if (grade >= 40 && grade <= 44) {
            this.score3++;
            this.accepted++;
        } else if (grade >= 45 && grade <= 49) {
            this.score4++;
            this.accepted++;
        } else if (grade >= 50 && grade <= 60) {
            this.score5++;
            this.accepted++;
        }
    }
    
    private int chooseScore(int i){
        if (i == 5){
            return this.score5;
        } else if (i == 4){
            return this.score4;
        } else if (i == 3) {
            return this.score3;
        } else if (i == 2) {
            return this.score2;
        } else if (i == 1) {
            return this.score1;
        }
        
        return this.score0;
    }
    
    private double calcAccepted(){
        if (this.total > 0){
            return 100 * this.accepted / this.total;
        }
        return 0;
    }
    
}
    

