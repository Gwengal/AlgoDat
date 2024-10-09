package Kapitel_03.Aufgabe_02;

public class Patient {
    private String _sName;

    /**
     * Konstruktor
     *
     * @param sName     Name des Patienten
     */
    public Patient(String sName) {
        this._sName = sName;
    }

    /**
     * Getter für _sName
     *
     * @return      Name des Patienten
     */
    public String getName() {
        return this._sName;
    }

    /**
     * Referenzbeschreibung/-bezeichnung zurückgeben
     *
     * @return      Name des Patienten
     */
    @Override
    public String toString() {
        return this.getName();
    }
}
