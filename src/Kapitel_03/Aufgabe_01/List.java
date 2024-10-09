package Kapitel_03.Aufgabe_01;

public class List<T extends Comparable<T>>{
    private Node _oHead;

    class Node {
        private T _oValue;
        private Node _oNext;

        /**
         * Pseudokonstruktor
         */
        public Node() { }

        /**
         * Konstruktor für einen neuen Knoten
         *
         * @param oValue    Referenz, welche in diesem Knoten gespeichert werden soll
         * @param oNext     Referenz, welche zum nächsten Knoten zeigt
         */
        public Node(T oValue, Node oNext) {
            this._oValue = oValue;
            this._oNext = oNext;
        }
    }

    /**
     * Konstruktor, womit der Start (Head) der Liste initialisiert wird
     */
    public List() {
        this._oHead = new Node();
    }

    /**
     * Methode zum Einfügen von neuen Elementen (sortierte Reihenfolge)
     *
     * @param oValue    Referenz, welche in die sortierte Liste aufgenommen werden soll
     */
    public void insert(T oValue) {
        Node oNode = this._oHead;

        while (oNode._oNext != null) {

            if (oNode._oNext._oValue.compareTo(oValue) > 0) {
                break;
            }

            oNode = oNode._oNext;
        }

        oNode._oNext = new Node(oValue, oNode._oNext);
    }

    /**
     * Alle Objekte in der Liste in der Konsole ausgeben
     */
    public void print() {
        Node oNode = this._oHead;

        while (oNode._oNext != null) {
            System.out.println(oNode._oNext._oValue);
            oNode = oNode._oNext;
        }
    }
}
