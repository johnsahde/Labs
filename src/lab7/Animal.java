/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7;

/**
 *
 * @author JONATHAN
 */
public abstract class Animal {
    
    protected int legs;
    
    protected Animal (int legs) {
        this.legs = legs;
    } 
    
    public void walk () {
        System.out.println("This animal walks on " + legs + " legs.");
    }
    
    public abstract void eat ();
}
