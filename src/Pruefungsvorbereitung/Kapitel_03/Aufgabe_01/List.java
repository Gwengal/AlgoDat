package Pruefungsvorbereitung.Kapitel_03.Aufgabe_01;

public abstract class List<t extends Comparable<? super t>> {
    class Node {
        private t data;
        private Node next;

        public Node() {
            this.data = null;
            this.next = null;
        }

        public Node(t data, Node next) {
            this.data = data;
            this.next = next;
        }

        public t getData() {
            return this.data;
        }

        public Node getNext() {
            return this.next;
        }

        public void setData(t data) {
            this.data = data;
        }

        public void setNext(Node node) {
            this.next = node;
        }
    }

    protected Node head;

    public abstract void insert(t data);

    public abstract void delete(t data);

    public abstract t member(t data);

    public abstract void print();
}
