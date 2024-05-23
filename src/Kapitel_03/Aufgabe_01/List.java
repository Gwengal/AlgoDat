package Kapitel_03.Aufgabe_01;

// class List

// void insert(Kunde kunde) -- hängt ein Kundenobjekt nach Kunden-
// nummer sortiert in die Liste ein
// void delete(int nr) -- löscht das durch die Kundennummer
// angegeben Kundenobjekt aus der Liste
// Kunde member(int nr) -- sucht das Kundenobjekt mit der
// angegebenen Kundennummer
// void print() -- gibt die komplette Kundenliste aus

public class List<T extends Comparable<T>> {
    private Node _oHead;

    class Node {
        private T _oElement;
        private Node _oNext;

        /**
         * Konstruktor für Node
         * 
         * @param oElement
         * @param oNext
         */
        public Node(T oElement, Node oNext) {
            this._oElement = oElement;
            this._oNext = oNext;
        }
    }

    /**
     * Übergebenes Element wird an x-beliebiger Stelle in der Liste
     * hinzugefügt (in Abhängigkeit der compareTo-Methode)
     * 
     * @param oElement
     */
    public void insert(T oElement) {
        Node oNode = this.getHead();

        // Übergebenes Element wird an erster Stelle angehangt wenn:
        // 1. Kopf-Ebene noch nicht zugewiesen wurde (null)
        // 2. Identifikator des übergebenen Elements kleiner als der
        // Identifikator des Elements der Kopf-Ebene ist
        // 3. Element der Kopf-Ebene wird um eine Stelle nach hinten verschoben
        if (oNode == null || oNode._oElement.compareTo(oElement) > 0) {
            this._oHead = new Node(oElement, oNode);
        }
        // Übergebenes Element wird an einer x-beliebigen Stelle (nach der ersten)
        // in der Liste angehangen:
        // -> Gleiches Prinzip wie beim Einsetzen an der ersten Stelle
        else {
            while (oNode._oNext != null) {
                if (oNode._oNext._oElement.compareTo(oElement) > 0) {
                    break;
                }
                oNode = oNode._oNext;
            }

            oNode._oNext = new Node(oElement, oNode._oNext);
        }
    }

    /**
     * Node-Fragmente mit den Elementen suchen anhand dem übergebenen Identifier
     * 
     * @param id
     */
    public <E> void delete(E key, Comperator<E, T> comparator) {
        Node oNode = this._oHead;

        // Liste ist leer. Löschen wird nicht benötigt
        if (oNode != null) {
            // Head-Element mit dem Node überschreiben
            if (comparator.compare(key, oNode._oElement)) {
                this._oHead = oNode._oNext;
            } else {
                // Elemente in der Liste suchen und dem darauffolgenden
                // Node überschreiben
                while (oNode._oNext != null) {
                    if (comparator.compare(key, oNode._oNext._oElement)) {
                        oNode._oNext = oNode._oNext._oNext;
                    }

                    oNode = oNode._oNext;
                }
            }
        }
    }

    /**
     * Ermittlungs des Elements anhand des überbenen Identifiers
     * 
     * @param id
     * @return
     */
    public <E> T member(E key, Comperator<E, T> comperator) {
        Node oNode = this._oHead;

        while (oNode != null) {
            if (comperator.compare(key, oNode._oElement)) {
                return oNode._oElement;
            }

            oNode = oNode._oNext;
        }

        return null;
    }

    /**
     * Ausgabe der Elemente, die sich in der Liste befinden
     */
    public void print() {
        Node oNode = this.getHead();

        while (oNode != null) {
            System.out.println(oNode._oElement);
            oNode = oNode._oNext;
        }
    }

    /**
     * Getter für _oHead
     * 
     * @return
     */
    private Node getHead() {
        return this._oHead;
    }
}
