package Kapitel_02.Aufgabe_08;

public class TestStack {
    public static void main(String[] args) {
        Stack<Buch> oStack = new Stack<Buch>(5);
        oStack.print();
        try {
            oStack.push(new Buch("1984", "George Orwell"));
            oStack.push(new Buch("To Kill a Mockingbird", "Harper Lee"));
            oStack.push(new Buch("Pride and Prejudice", "Jane Austen"));
            oStack.push(new Buch("The Catcher in the Rye", "J.D. Salinger"));
            oStack.push(new Buch("The Great Gatsby", "F.Scott Fitzgerald"));

            oStack.print();
            oStack.pop();
            oStack.pop();
            oStack.pop();
            oStack.pop();
            oStack.pop();
            oStack.pop();
        } catch (Exception e) { 
            System.out.println(e.getMessage());
        }
    }
}
