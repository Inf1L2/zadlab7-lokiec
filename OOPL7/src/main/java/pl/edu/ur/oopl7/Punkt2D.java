/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author lokyiec
 */

import java.util.Random;

public class Punkt2D {
    public int x;
    public int y;
    
    public Punkt2D(){
        x=0;
        y=0;
    }
    public Punkt2D(int x, int y){
        this.x=x;
        this.y=y;
                
    }
    public int gx(){
        return x;
    }
    public int gy(){
        return y;
    }
    
    public Punkt2D losowanie(){
        Random random = new Random();
        int a = random.nextInt(21)-10;
        int b = random.nextInt(21)-10;
        Punkt2D d = new Punkt2D(a,b);
        return d;
    }
    
    public String toString(){
        return x + "," + y;
    }
              
              
}