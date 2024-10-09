package Pruefungsvorbereitung.Kapitel_03.Aufgabe_01;

public class ListWithHeader<T extends Comparable<? super T>> extends List<T> {

    @Override
    public void insert(T data) {
        Node node = this.head;

        if (node == null || node.getData().compareTo(data) > 0) {
            this.head = new Node(data, node);
        } else {
            while (node.getNext() != null) {
                if (node.getNext().getData().compareTo(data) > 0) {
                    break;
                }

                node = node.getNext();
            }

            node.setNext(new Node(data, node.getNext()));
        }
    }

    @Override
    public void print() {
        Node node = this.head;

        while (node != null) {
            System.out.printf("%s\n", node.getData());
            node = node.getNext();
        }

        System.out.println();
    }

    @Override
    public void delete(T data) {
        Node node = this.head;

        if (node == null) {
            return;
        }

        if (node.getData().compareTo(data) == 0) {
            this.head = node.getNext();
        } else {
            while (node.getNext() != null) {
                if (node.getNext().getData().compareTo(data) == 0) {
                    node.setNext(node.getNext().getNext());
                    break;
                }

                node = node.getNext();
            }
        }

    }

    @Override
    public T member(T data) {
        Node node = this.head;

        while (node != null) {
            if (node.getData().compareTo(data) == 0) {
                return node.getData();
            }

            node = node.getNext();
        }

        return null;
    }
}
