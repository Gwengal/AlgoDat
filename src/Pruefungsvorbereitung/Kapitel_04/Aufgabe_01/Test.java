package Pruefungsvorbereitung.Kapitel_04.Aufgabe_01;

import Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Alt.BubbleSortAlt;
import Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Alt.InsertionSortAlt;
import Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Alt.SelectionSortAlt;

public class Test {
    public static void main(String[] args) {
        Sort[] sorts = new Sort[3];
        sorts[0] = new BubbleSortAlt();
        sorts[1] = new InsertionSortAlt();
        sorts[2] = new SelectionSortAlt();

        for (Sort sort : sorts) {
            int[] array = { 4, 5, 7, 3, 1, 1 };

            System.out.println("Unsortiert: ");
            print(array);

            sort.sort(array);
            System.out.println("Sortiert: ");
            print(array);
        }
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d, ", i);
        }

        System.out.println();
    }
}
