package Kapitel_02.Aufgabe_07;

public class BinSuche implements Suchen {
    @Override
    public int search(int[] array, int key) throws Exception {
        int iStart = 0, iEnd = array.length - 1, iCenter = 0, iIter = 0;

        while (iStart <= iEnd) {
            iIter += 1;
            iCenter = iStart + (iEnd - iStart) / 2;

            if (array[iCenter] == key) {
                return iIter;
            } else if (array[iCenter] < key) {
                iStart = iCenter + 1;
            } else {
                iEnd = iCenter - 1;
            }
        }

        throw new Exception(String.format("Element %d wurde im Array nicht gefunden!", key));
    }
}
