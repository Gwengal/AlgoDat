package Kapitel_02.Aufgabe_08;

public class Stack<T> {
    private int _iTop;
    private T[] _aStack;

    /**
     * Konstruktor
     * 
     * @param max
     */
    @SuppressWarnings("unchecked")
    public Stack(int max) {
        this._aStack = (T[]) new Object[max];
        this._iTop = 0;
    }

    /**
     * Gibt zurück, ob der Stack leer ist
     * 
     * @return
     */
    public boolean isEmpty() {
        return this._iTop == 0;
    }

    /**
     * Gibt zurück, ob der Stack voll ist
     * 
     * @return
     */
    public boolean isFull() {
        return this._iTop == this._aStack.length;
    }

    /**
     * 1. Prüfen ob Stack bereits voll
     * Ja -> Exception schmeißen
     * 2. Fügt das übergebene Element dem Stack hinzu
     * 3. Erhöhen von _iTop um 1
     * 
     * @param element
     * @throws Exception
     */
    public void push(T element) throws Exception {
        if (this.isFull()) {
            throw new Exception(String.format("Element %s passt nicht rein.\nDer Stack ist voll %s!\n", element,
                    this.getCapacity()));
        }

        this._aStack[this._iTop++] = element;
    }

    /**
     * 1. Prüfen ob Stack leer
     * Ja -> Exception schmeißen
     * 2. Reduzierung _iTop um 1
     * 3. Letztes Element aus dem Stack rausholen
     * 4. Frei gewordenen Platz mit null belegen
     * 5. Rausgeholtes Element zurückgeben
     * 
     * @return
     * @throws Exception
     */
    public T pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception(String.format("Der Stack ist leer %s!\n", this.getCapacity()));
        }

        T element = this._aStack[--this._iTop];
        this._aStack[this._iTop] = null;

        return element;
    }

    /**
     * Ausgabe der Elemente im Stack
     */
    public void print() {
        System.out.printf("Elemente im Stack %s:\n", this.getCapacity());

        for (T element : this._aStack) {
            if (element != null) {
                System.out.printf("\t%s\n", element);
            }
        }
    }

    /**
     * Gibt den aktuellen befüllt-heits-grad als String zurück
     * -> ([aktuelle Elemente]/[max Elemente])
     * 
     * @return
     */
    private String getCapacity() {
        return String.format("(%d/%d)", this._iTop, this._aStack.length);
    }
}
