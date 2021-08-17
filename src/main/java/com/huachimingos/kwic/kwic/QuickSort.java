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
public class QuickSort {
    Line[] names;
    int length;

    public QuickSort() {
    }
    
    void sort(Line[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        Line pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].getLine().compareToIgnoreCase(pivot.getLine()) < 0) {
                i++;
            }

            while (this.names[j].getLine().compareToIgnoreCase(pivot.getLine()) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        Line temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }

    public Line[] getNames() {
        return names;
    }
    
    
}
