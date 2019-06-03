/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public Bird(String name) {
        this.name = name;
    }

    public void setLatinName(String newName) {
        this.latinName = newName;
    }

    public void observe() {
        this.observations++;
    }

    public String toString() {
        return "" + this.name + " (" + this.latinName + ") : " + this.observations + " observations";
    }

    public String getName() {
        return this.name;
    }

}
