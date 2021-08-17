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
public class Alphabetizer {

    Line[] lines;

    public Alphabetizer() {
    }

    public Alphabetizer(Line[] lines) {
        QuickSort sorter = new QuickSort();
        sorter.sort(lines);
        this.lines = sorter.getNames();
    }

    public Line[] getLines() {
        return lines;
    }

    public void setLines(Line[] lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        String msg = "Alphabetizer{";
        for (int i = 0; i < lines.length; i++) {
            msg += "\n sorted=" + lines[i].toString();
        }
        msg += "\n }";
        return msg;
    }

}
