package Pruefungsvorbereitung.Kapitel_03.Aufgabe_02;

public class Test {
    public static void main(String[] args) {
        QueueVerkettet<String> queue = new QueueVerkettet<>();

        queue.enqueue("Alex");
        queue.enqueue("Jasmin");
        queue.enqueue("Paul");
        queue.dequeue();
        queue.enqueue("Daniel");
        queue.enqueue("Christian");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
