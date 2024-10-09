package Pruefungsvorbereitung.Kapitel_04.Aufgabe_01;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] arr) {
        int temp; 
        boolean bSort = true;

        while(bSort) {
            bSort = false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] > arr[i]) {
                    temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;

                    bSort = true;
                }                
            }
        }
    }
}
