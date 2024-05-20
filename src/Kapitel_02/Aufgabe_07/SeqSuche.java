package Kapitel_02.Aufgabe_07;

public class SeqSuche implements Suchen{
    @Override
    public int search(int[] array, int key) throws Exception{
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;                
            }
        }

        throw new Exception(String.format("Element %d wurde im Array nicht gefunden!", key));
    }
}
