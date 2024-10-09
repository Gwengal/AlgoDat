package Pruefungsvorbereitung.Kapitel_05.Aufgabe_02;

public class Test {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        int[] keys = { 3, 2, 1, 5, 4, 6, 8, 7, 9 }; // Reihenfolge so gewählt, dass jede Rotation auftritt
        char data = 'a';

        for (int key : keys) {
            tree.insert(key, data++);
        }
    }
}
