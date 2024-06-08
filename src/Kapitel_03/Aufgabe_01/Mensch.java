package Kapitel_03.Aufgabe_01;

public class Mensch implements Comparable<Mensch> {
    private String _sName;
    private int _iHeight;

    /**
     * Konstruktor
     *
     * @param sName     Name für den Menschen
     * @param iHeight   Größe des Menschen in cm
     */
    public Mensch(String sName, int iHeight) {
        this._sName = sName;
        this._iHeight = iHeight;
    }
    
    /**
     * Getter für _sName
     *
     * @return      Name des Menschen
     */
    public String getName(){
        return this._sName;
    }

    /**
     * Getter für _iHeight
     *
     * @return      Größe des Menschen
     */
    public int getHeight(){
        return this._iHeight;
    }

    /**
     * Referenzbeschreibung/-bezeichnung zurückgeben
     *
     * @return      String, welches das Objekt beschreibt
     */
    @Override
    public String toString() {
        return String.format("%s ist %d cm groß", this.getName(), this.getHeight());
    }

    /**
     * Vergleicht die Körpergröße von der aktuellen Mensch-Referenz mit der
     * übergebenen Mensch-Referenz
     *
     * @param o     the object to be compared.
     * @return      Gibt zurück, welcher der Mensch-Referenzen größer ist
     */
    @Override
    public int compareTo(Mensch o) {
        return this.getHeight() - o.getHeight();
    }
}
