/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huachimingos.kwic.kwic;

/**
 *
 * @author martin
 */
public class Line {
    String line;
    int index;

    public Line(String line, int index) {
        this.line = line;
        this.index = index;
    }

    public Line() {
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Line{" + "line=" + line + ", index=" + index + '}';
    }
    
}
