package Kapitel_03.Aufgabe_02;

public class Queue<T> {
    private Node _oHead;

    class Node {
        private T _oValue;
        private Node _oNext;

        /**
         * Pseudokonstruktor
         */
        public Node() {
        }

        /**
         * Konstruktor
         *
         * @param oValue Referenz, welche in den Knoten gespeichert werden soll
         * @param oNext  Referenz, die zum nächsten Knoten zeigt
         */
        public Node(T oValue, Node oNext) {
            this._oValue = oValue;
            this._oNext = oNext;
        }
    }

    /**
     * Konstruktor
     */
    public Queue() {
        this._oHead = new Node();
    }

    /**
     * Einhängen des Elements am Ende der Queue
     *
     * @param oValue Referenz, welche in die Queue eingehängt wird
     */
    public void enqueue(T oValue) {
        Node oNode = this._oHead;

        while (oNode._oNext != null) {
            oNode = oNode._oNext;
        }

        oNode._oNext = new Node(oValue, null);
    }

    /**
     * Erstes Element aus der Liste aushängen und zurückgeben
     *
     * @return Gibt das erste Element in der Queue zurück
     * @throws Exception Exception, falls sich kein Element mehr in der Queue befindet
     */
    public T dequeue() throws Exception {
        T oReturn = null;

        try {
            oReturn = this._oHead._oNext._oValue;
        } catch (NullPointerException e) {
            throw new Exception("Queue is Leer!");
        }

        this._oHead._oNext = this._oHead._oNext._oNext;

        return oReturn;
    }
}
