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

public class Main {
    public static void main(String[] args){
        Punkt2D[] tab2D = new Punkt2D[100];
        Punkt3D[] tab3D = new Punkt3D[100];

        for(int i = 0; i<100;i++){
            tab2D[i] = new Punkt2D().losowanie();
            tab3D[i] = new Punkt3D().losowanie();
        }
        
        for(int i=0;i<100;i++){
            if (tab2D[i].gx() == tab3D[i].gx() && tab2D[i].gy() == tab3D[i].gy()){
                System.out.println(tab2D[i].toString()+" | "+tab3D[i].toString());
            }
        }
    }
}
