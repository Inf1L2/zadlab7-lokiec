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

public class Osoba {
    String imie;
    String nazwisko;
    String data_ur;
    String plec;

    public Osoba(String imie, String nazwisko, String data_ur, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_ur = data_ur;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Osoba:" +
                "\n Imie = " + imie +
                "\n Nazwisko = " + nazwisko +
                "\n Data urodzenia = " + data_ur +
                "\n plec = " + plec;
    }
}
