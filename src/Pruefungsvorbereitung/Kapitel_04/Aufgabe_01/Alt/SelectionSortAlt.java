package Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Alt;

import Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Sort;

public class SelectionSortAlt implements Sort {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
