package Pruefungsvorbereitung.Kapitel_04.Aufgabe_01;

public class SectionSort implements Sort {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[iMin]) {
                    iMin = j;
                }        
            }

            int temp = arr[iMin];
            arr[iMin] = arr[i];
            arr[i] = temp;
        }
    }
}
