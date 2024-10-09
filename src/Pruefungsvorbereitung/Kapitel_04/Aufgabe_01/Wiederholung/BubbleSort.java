package Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Wiederholung;

import Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Sort;

/**
 * BubbleSort
 */
public class BubbleSort implements Sort{
    @Override
    public void sort(int[] arr) {
        boolean bSort = true;

        while(bSort) {
            bSort = false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] > arr[i]) {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;

                    bSort = true;
                }
            }
        }
    }
    
}