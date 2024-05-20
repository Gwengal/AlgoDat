package Kapitel_02.Aufgabe_08;

public class Buch {
    private String _sName;
    private String _sAutor;

    public Buch(String name, String autor){
        this._sName = name;
        this._sAutor = autor;
    }

    @Override
    public String toString() {
        return String.format("Buch: %s wurde verfasst von %s", this._sName, this._sAutor);
    }
}
