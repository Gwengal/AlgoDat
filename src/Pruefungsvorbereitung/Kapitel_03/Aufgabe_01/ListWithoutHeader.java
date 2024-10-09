package Pruefungsvorbereitung.Kapitel_03.Aufgabe_01;

public class ListWithoutHeader<t extends Comparable<? super t>> extends List<t> {
    public ListWithoutHeader() {
        this.head = new Node();
    }

    @Override
    public void insert(T data) {
        Node node = this.head;

        while (node.getNext() != null) {
            if (node.getNext().getData().compareTo(data) > 0) {
                break;
            }

            node = node.getNext();
        }

        node.setNext(new Node(data, node.getNext()));
    }

    @Override
    public void print() {
        Node node = this.head;

        while (node.getNext() != null) {
            System.out.printf("%s\n", node.getNext().getData());
            node = node.getNext();
        }

        System.out.println();
    }

    @Override
    public void delete(T data) {
        Node node = this.head;

        while (node.getNext() != null) {
            if (node.getNext().getData().compareTo(data) == 0) {
                node.setNext(node.getNext().getNext());
                break;
            }

            node = node.getNext();
        }
    }

    @Override
    public T member(T data) {
        Node node = this.head;

        while (node.getNext() != null) {
            if (node.getNext().getData().compareTo(data) == 0) {
                return node.getNext().getData();
            }

            node = node.getNext();
        }

        return null;
    }
}
