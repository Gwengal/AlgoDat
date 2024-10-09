package Pruefungsvorbereitung.Kapitel_03.Aufgabe_02;

public class QueueVerkettet<t> {
    class Node {
        private t data;
        private Node next;

        public Node(t data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void enqueue(t data) {
        Node newNode = new Node(data);

        if (this.isEmpty()) {
            this.head = newNode;            
        }else {
            Node current = this.head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public t dequeue() {
        if (this.isEmpty()) {
            return null;            
        }

        t data = head.data;
        head = head.next;

        return data;
    }

    private boolean isEmpty() {
        return this.head == null;
    }
}
