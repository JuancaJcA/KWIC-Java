package com.huachimingos.kwic;

import com.huachimingos.kwic.kwic.CircularShifter;
import java.util.Arrays;

public class main {
    public static void main(String[] args){
        String[] data = {"1984", "Cien años de soledad", "El señor de los anillos", "Don Quijote de la Mancha"};
        CircularShifter shifter = new CircularShifter(data);
        for(int i = 0; i < shifter.getLines().length; i++){
            if(shifter.getLines()[i] != null){
                System.out.println(shifter.getLines()[i].toString());   
            }
        }
    }
}
