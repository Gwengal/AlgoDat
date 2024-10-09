package Pruefungsvorbereitung.Kapitel_04.Aufgabe_01;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] arr) {
        int j, elem;

        for(int i = 1; i < arr.length; i++) {
            elem = arr[i];
            j = i;

            while (j > 0 && arr[j-1] > elem) {
                arr[j] = arr[j-1];
                j--;                
            }

            arr[j] = elem;
        }


    }
}
