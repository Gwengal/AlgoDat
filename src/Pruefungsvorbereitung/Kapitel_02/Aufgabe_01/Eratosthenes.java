package Pruefungsvorbereitung.Kapitel_02.Aufgabe_01;

public class Eratosthenes {
    public static void main(String[] args) {
        int[] array = Eratosthenes.createArray(500);
        Eratosthenes.siebe(array);
        Eratosthenes.print(array);
    }

    private static int[] createArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n ; i++) {
            if(i <= 1) {
                array[i] = 0;
                continue;
            }

            array[i] = i;
        }

        return array;
    }

    private static void print(int[] array) {
        System.out.printf("Primzahlen im Wertebereich %d - %d:\n", 0, array.length);

        for(Integer i : array) {
            if (i != 0)
                System.out.printf("%d ist eine Primzahl.\n", i);
        }
    }

    private static void siebe(int[] array) {
        for(int i = 2; i < array.length; i++) {
            if(array[i] == 0) {
                continue;
            }

            for(int j = i * i; j < array.length; j += i) {
                array[j] = 0;
            }
        }
    }
}
