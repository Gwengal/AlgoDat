package Pruefungsvorbereitung.Kapitel_02.Aufgabe_08;

public class Stack<t>{
    private int top;
    private t[] array;

    public Stack(int max) {
        this.top = 0;
        this.array = (t[]) new Object[max];
    }

    public void push(t item) throws Exception{
        this.isFull();
        this.array[this.top++] = item;
    }

    public t pop() throws Exception{
        this.isEmpty();

        t temp = this.array[--this.top];
        this.array[this.top] = null;

        return temp;
    }

    public void isFull() throws Exception{
        if (this.top == this.array.length){
            throw new Exception("Stack is full");
        }
    }

    public void isEmpty() throws Exception{
        if (this.top == 0) {
            throw new Exception("Stack is empty");
        }
    }

    public void print() {
        for(t temp : this.array) {
            System.out.println(temp);
        }
    }
}
