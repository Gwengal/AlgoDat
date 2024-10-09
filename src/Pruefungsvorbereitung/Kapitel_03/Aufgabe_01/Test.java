package Pruefungsvorbereitung.Kapitel_03.Aufgabe_01;

public class Test {
    public static void main(String[] args) {
        List<Mensch>[] lists = new List[2];

        lists[0] = new ListWithHeader<>();
        lists[1] = new ListWithoutHeader<>();

        for (List<Mensch> list : lists) {
            System.out.printf("Ausführung mit der Liste [%s]:\n", list.getClass().getSimpleName());

            list.insert(new Mensch("Joachim", 175));
            list.insert(new Mensch("Angelina", 165));
            list.insert(new Mensch("Jakob", 185));
            list.insert(new Mensch("Maria", 169));
            list.insert(new Mensch("Alex", 172));

            list.print();

            System.out.printf("Suche den ersten mit Körpergröße 185cm: %s\n\n", list.member(new Mensch(null, 185)));

            list.delete(new Mensch(null, 185));
            list.delete(new Mensch(null, 175));
            list.delete(new Mensch(null, 172));
            list.delete(new Mensch(null, 185));

            list.print();
        }
    }
}
