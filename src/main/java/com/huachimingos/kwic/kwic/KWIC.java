/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huachimingos.kwic.kwic;

import java.io.File;

/**
 *
 * @author martin
 */
public class KWIC {
    Input input;
    Characters characters;
    CircularShifter shifter;
    Alphabetizer alphabetizer;
    Output output;
    Line[] lineIndex;

    public KWIC(File file) {
        //Applying KWIC
        this.input = new Input(file);
        this.characters = new Characters(this.input.getResult());
        this.shifter = new CircularShifter(this.characters.getLines());
        this.alphabetizer = new Alphabetizer(this.shifter.getLines());
        this.output = new Output(this.alphabetizer.getLines());
        System.out.println(output.toString());
            
        this.lineIndex = this.alphabetizer.getLines();
    }

    public Input getInput() {
        return input;
    }

    public Output getOutput() {
        return output;
    }

    public Characters getCharacters() {
        return characters;
    }

    public CircularShifter getShifter() {
        return shifter;
    }

    public Alphabetizer getAlphabetizer() {
        return alphabetizer;
    }

    public Line[] getLineIndex() {
        return lineIndex;
    }
    
    
    
}
