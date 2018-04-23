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

public class Punkt3D extends Punkt2D{
    private int z;
    
    
    public Punkt3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Punkt3D() {
    }
   
     public int gz(){
        return z;
    }
    
   
    @Override
    public Punkt3D losowanie(){
    Random random = new Random();
    int a = random.nextInt(21)-10;
    int b = random.nextInt(21)-10;
    int c = random.nextInt(21)-10;              
    Punkt3D d = new Punkt3D(a,b,c);
              return d;
    }
    public String toString() {
        return "x=" + this.x + ", y=" + this.y + ", z=" + this.z;
    }




}