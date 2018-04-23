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

public class Student extends Osoba{
    int nr_ineksu;
    String typ_std;
    String kierunek;
    int rok_std;

    public Student(String imie, String nazwisko, String data_ur, String plec,
                   int nr_ineksu, String typ_std, String kierunek, int rok_std) {
        super(imie,nazwisko,data_ur,plec);
        this.nr_ineksu = nr_ineksu;
        this.typ_std = typ_std;
        this.kierunek = kierunek;
        this.rok_std = rok_std;
    }

    @Override
    public String toString() {
        return "Student:" +
                "\n Nr indeksu = " + nr_ineksu +
                "\n Typ studiow = " + typ_std +
                "\n Kierunek = " + kierunek +
                "\n Rok studiow = " + rok_std +
                "\n Imie = " + imie +
                "\n Nazwisko = " + nazwisko +
                "\n Data urodzenia = " + data_ur +
                "\n Plec = " + plec;
    }
}
