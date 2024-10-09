package Pruefungsvorbereitung.Kapitel_03.Aufgabe_03;

public class Reallokation {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Ausgabe Array vor Reallokation: \n");
        Reallokation.print(array);

        array = Reallokation.reallocate(array, 5);

        System.out.println("Ausgabe Array nach Reallokation: \n");
        Reallokation.print(array);
    }

    public static int[] reallocate(int[] oldArr, int size) {
        int[] array = new int[oldArr.length + size];

        for (int i = 0; i < oldArr.length; i++) {
            array[i] = oldArr[i];
        }

        return array;
    }

    public static void print(int[] array) {
        System.out.printf("Array besitzt [%d] Index-Werte (0 = Wert nicht zugewiesen):\n", array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" - Index[%d] ist der Wert [%d] zugewiesen.\n", i, array[i]);
        }
    }
}
