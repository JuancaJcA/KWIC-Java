/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huachimingos.kwic.kwic;

import java.sql.DriverManager;

/**
 *
 * @author martin
 */
public class CircularShifter {
    Line[] lines;

    public CircularShifter() {
    }

    public CircularShifter(String[] lines) {
        this.lines = this.circularShift(lines);
    }

    public Line[] getLines() {
        return lines;
    }

    public void setLines(String[] lines) {
        this.lines = this.circularShift(lines);
    }
    
    private Line[] circularShift(String[] lines){
        int wordCount = countWords(lines);
        Line[] result = new Line[wordCount];
        for(String line : lines){
            String[] division = line.split(line);
        }
        return result;
    }
    
    private int countWords(String[] lines){
        int total = 0;
        for(String line : lines){
            String[] division = line.split(" ");
            total += division.length;
        }
        return total;
    }
}
