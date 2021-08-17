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
        int currentIndex = 0;
        int lineIndex = 0;
        for(String line : lines){
            String[] words = line.split(" ");
            int lastIndex = words.length - 1;
            if(lastIndex == 0){
                result[currentIndex] = new Line(arrayToString(words), lineIndex);
                currentIndex++;
            }
            else{
                result[currentIndex] = new Line(arrayToString(words), lineIndex);
                currentIndex++;
                for(int i = 0; i < lastIndex; i++){
                    String[] newWords = new String[words.length];
                    System.arraycopy(words, 0, newWords, 1, words.length - 1);
                    newWords[0] = words[words.length - 1];
                    result[currentIndex] = new Line(arrayToString(newWords), lineIndex);
                    currentIndex++;
                    words = newWords;
                }
            }
            lineIndex++;
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
    
    private String arrayToString(String[] array){
        String result = "";
        for(String word : array){
            result += word;
            result += " ";
        }
        return result.substring(0, result.length() - 1);
    }

    @Override
    public String toString() {
        String msg = "CircularShifter{";
        for(int i = 0; i < lines.length;i++){
            msg += "\n shifted=" + lines[i].toString();
        }
        msg += "\n }";
        return msg;
    }
    
}
