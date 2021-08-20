package com.huachimingos.kwic.kwic;

import com.huachimingos.kwic.kwic.Line;
/**
 * @author sergio (a veces jojos)
 */
public class Output {
    Line[] lines;

    public Output() {
    }

    public Output(Line[] lines) {
        this.lines = this.deleteWords(lines);
    }

    public Line[] getLines() {
        return lines;
    }

    public Line[] deleteWords(Line[] lines) {
        String[] ignoreWords = {"en", "un", "una", "unos", "unas", "el", "la", "los", "las", "y", "u", "e", "o", "de", "del", "a", "mi", "es", "al", "se"};
        Line[] newBooks = new Line[lines.length];

        for (int i = 0; i < lines.length; i++) {
            String newLinesSearch = "";
            String[] arrLine = lines[i].getLine().split(" ");

            for (int j = 0; j < arrLine.length; j++) {
                boolean helper = false;
                for(int k = 0; k < ignoreWords.length; k++){
                    if (arrLine[j].toLowerCase().equals(ignoreWords[k])){
                        helper = true;
                    }
                }
                if(!helper){
                    newLinesSearch += arrLine[j]+" ";
                }
            } 
          
            newLinesSearch = newLinesSearch.substring(0, newLinesSearch.length() - 1);
            Line line = new Line(newLinesSearch, lines[i].getIndex());
            newBooks[i]=line;
        }

        return newBooks;
    }

    @Override
    public String toString() {
        String msg = "CircularShifter{";
        for (int i = 0; i < lines.length; i++) {
            if (lines[i] != null) {
                msg += "\n shifted=" + lines[i].toString();
            }
            else{
                msg += "\n null";
            }
        }
        msg += "\n }";
        return msg;
    }
}
