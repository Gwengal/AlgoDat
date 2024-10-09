package Pruefungsvorbereitung.Kapitel_03.Aufgabe_04;

public class Test {
    public static void main(String[] args) {
        PrioList<Flugzeug> pList = new PrioList<>();
        pList.insert(new Flugzeug(2, "ABC"));
        pList.insert(new Flugzeug(1, "BCD"));
        pList.insert(new Flugzeug(4, "KAF"));
        pList.insert(new Flugzeug(1, "CDE"));
        pList.insert(new Flugzeug(2, "HJI"));
        pList.insert(new Flugzeug(2, "KLI"));
        pList.insert(new Flugzeug(1, "UUI"));
        pList.insert(new Flugzeug(3, "NLÖ"));

        pList.print();
        pList.remove();
        pList.remove();
        pList.remove();

        pList.print();
    }
}
