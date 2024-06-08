package Kapitel_03.Aufgabe_02;

public class Test {
    public static void main(String[] args) {
        Queue<Patient> oQueue = new Queue<>();
        oQueue.enqueue(new Patient("Alex"));
        oQueue.enqueue(new Patient("Joachim"));
        oQueue.enqueue(new Patient("Michael"));
        oQueue.enqueue(new Patient("Julie"));
        oQueue.enqueue(new Patient("Jasmin"));
        oQueue.enqueue(new Patient("Peter"));
        oQueue.enqueue(new Patient("Luis"));
        oQueue.enqueue(new Patient("Vincent"));
        oQueue.enqueue(new Patient("Adelina"));

        try {
            while (true) {
                System.out.println(oQueue.dequeue());
            }
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
