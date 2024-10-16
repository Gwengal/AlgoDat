package Pruefungsvorbereitung.Kapitel_02.Aufgabe_08;

public class Buch {
    private String title;
    private String author;
    private int year;

    public Buch(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Title:\t%s\nAuthor:\t%s\nYear:\t%d", this.title, this.author, this.year);
    }
}
