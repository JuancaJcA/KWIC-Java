/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huachimingos.kwic.kwic;

/**
 *
 * @author sergio
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

    private Line[] circularShift(String[] lines) {
        String[] ignoreWords = {"en", "un", "una", "unos", "unas", "el", "la", "los", "las", "y", "u", "e", "o", "de", "del", "a", "mi", "es", "al", "se"};

        int wordCount = countWords(lines);
        Line[] result = new Line[wordCount];
        int currentIndex = 0;
        int lineIndex = 0;
        for (String line : lines) {
            String[] words = line.split(" ");
            int lastIndex = words.length - 1;
            if (lastIndex == 0) {
                result[currentIndex] = new Line(arrayToString(words), lineIndex);
                currentIndex++;
            } else {
                boolean ignorable1 = false;
                for (String ignoreWord : ignoreWords) {
                    if (ignoreWord.equalsIgnoreCase(words[0])) {
                        ignorable1 = true;
                    }
                }
                if (!ignorable1) {
                    result[currentIndex] = new Line(arrayToString(words), lineIndex);
                    currentIndex++;
                }

                for (int i = 0; i < lastIndex; i++) {
                    String[] newWords = new String[words.length];
                    System.arraycopy(words, 0, newWords, 1, words.length - 1);
                    newWords[0] = words[words.length - 1];
                    boolean ignorable = false;
                    for (String ignoreWord : ignoreWords) {
                        if (ignoreWord.equalsIgnoreCase(newWords[0])) {
                            ignorable = true;
                        }
                    }
                    if (!ignorable) {
                        result[currentIndex] = new Line(arrayToString(newWords), lineIndex);
                        currentIndex++;
                    }
                    words = newWords;
                }
            }
            lineIndex++;
        }
        
        int realLength = 0;
        for(int i = 0; i < result.length;i++){
            if(result[i] != null){
                realLength++;
            }
        }
        
        Line[] realResult = new Line[realLength];
        for(int i = 0; i < realLength;i++){
            realResult[i] = result[i];
        }
        return realResult;
    }

    private int countWords(String[] lines) {
        int total = 0;
        for (String line : lines) {
            String[] division = line.split(" ");
            total += division.length;
        }
        return total;
    }

    private String arrayToString(String[] array) {
        String result = "";
        for (String word : array) {
            result += word;
            result += " ";
        }
        return result.substring(0, result.length() - 1);
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
