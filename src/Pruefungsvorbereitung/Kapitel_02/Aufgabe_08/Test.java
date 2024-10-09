package Pruefungsvorbereitung.Kapitel_02.Aufgabe_08;

public class Test {
    public static void main(String[] args) {
        Stack<Buch> stack = new Stack<Buch>(5);
        try {
            stack.push(new Buch("ABC", "William", 1932));
            stack.push(new Buch("ABC", "William", 1932));
            stack.push(new Buch("ABC", "William", 1932));
            stack.push(new Buch("ABC", "William", 1932));
            stack.push(new Buch("ABC", "William", 1932));
            stack.push(new Buch("ABC", "William", 1932));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        stack.print();

        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        stack.print();
    }
}
