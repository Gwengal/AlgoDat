package Pruefungsvorbereitung.Kapitel_05.Aufgabe_01;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(6);
        tree.insert(4);
        tree.insert(8);
        tree.insert(2);
        tree.insert(7);
        tree.insert(3);
        tree.insert(5);
        tree.insert(9);
        tree.insert(1);

        System.out.printf("Finde Information für key [%d]: [%s]\n\n", 8, tree.member(8));

        tree.print();
        System.out.println();

        tree.delete(6);
        tree.print();
        System.out.println();

        tree.delete(7);
        tree.print();
        System.out.println();
    }
}
