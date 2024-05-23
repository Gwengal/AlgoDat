package Kapitel_03.Aufgabe_01;

public class Mensch implements Comparable<Mensch> {

    private int _iHeight;
    private String _sName;

    public Mensch(int iHeight, String sName) {
        this._iHeight = iHeight;
        this._sName = sName;
    }

    @Override
    public int compareTo(Mensch oMensch) {
        return this.getHeight() - oMensch.getHeight();
    }

    /**
     * Getter für _iHeight
     * 
     * @return
     */
    public int getHeight() {
        return this._iHeight;
    }

    /**
     * Rückgabe des Komperators zum Vergleich des Objektes anhand eines Key-Values
     * 
     * @return
     */
    public Comperator<Integer, Mensch> getComperator() {
        return (key, element) -> key.equals(element._iHeight);
    }
}
