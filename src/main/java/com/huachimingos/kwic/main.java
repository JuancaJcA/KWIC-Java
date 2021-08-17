package com.huachimingos.kwic;

import com.huachimingos.kwic.kwic.Alphabetizer;
import com.huachimingos.kwic.kwic.CircularShifter;
import com.huachimingos.kwic.kwic.Line;

public class main {
    public static void main(String[] args){
        String[] data = {"1984", "Cien años de soledad", "El señor de los anillos", "Don Quijote de la Mancha"};
        CircularShifter shifter = new CircularShifter(data);
        Alphabetizer alphabetizer = new Alphabetizer(shifter.getLines());
        System.out.println(alphabetizer.toString());
    }
}
