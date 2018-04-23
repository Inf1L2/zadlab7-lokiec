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

public class Wykladowca extends Osoba{
    String specjalizacja;
    String lataPracy;
    String stopien;

    public Wykladowca(String imie, String nazwisko, String data_ur, String plec,
                      String specjalizacja, String lataPracy, String stopien) {
        super(imie,nazwisko,data_ur,plec);
        this.specjalizacja = specjalizacja;
        this.lataPracy = lataPracy;
        this.stopien = stopien;
    }

    @Override
    public String toString() {
        return "Wykladowca:" +
                "\n Specjalizacja = " + specjalizacja +
                "\n Lata Pracy = " + lataPracy +
                "\n Stopien = " + stopien +
                "\n Imie = " + imie +
                "\n Nazwisko = " + nazwisko +
                "\n Data urodzenia = " + data_ur +
                "\n Plec = " + plec;
    }
}
