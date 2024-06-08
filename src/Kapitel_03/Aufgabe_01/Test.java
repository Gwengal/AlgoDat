package Kapitel_03.Aufgabe_01;

public class Test {
    public static void main(String[] args) {
        // Neue Liste erzeugen
        List<Mensch> oList = new List<>();

        // 6 Einträge sortiert in die Liste einfügen
        oList.insert(new Mensch("Alex", 175));
        oList.insert(new Mensch("Jasmin", 165));
        oList.insert(new Mensch("Timo", 140));
        oList.insert(new Mensch("Michael", 150));
        oList.insert(new Mensch("Jason", 175));
        oList.insert(new Mensch("Adelina", 165));

        // Liste ausgeben
        oList.print();
    }
}
