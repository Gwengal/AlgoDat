package Kapitel_02.Aufgabe_03;

public class TestSuche {
    public static void main(String[] args) {
        TestSuche.binarySearch(TestSuche.getArray(50), 51);
    }

    /**
     * Erzeugt ein Integer-Array mit n-Werten
     * 
     * @param n
     * @return
     */
    private static int[] getArray(int n) {
        int[] aSortedNumbers = new int[n];

        for (int i = 0; i < aSortedNumbers.length; i++) {
            aSortedNumbers[i] = (i + 1);
        }

        return aSortedNumbers;
    }

    /**
     * 1. Initialisierung vom linken Startpunkt = 0 und
     *    dem rechten Endpunkt = array.length-1
     * 2. Schleife wird solange durchlaufen bis das Element gefunden wurde
     *    oder der Startpunkt den Endpunkt überschreitet
     * 3. Mittelpunkt wird wie folgt berechnet:
     *    - Endpunkt - Startpunkt 
     *    - Ergebnis / 2
     *    - Ergebnis + Startpunkt -> Mitte
     * 4. Sollte das gesuchte Element größer als das aktuelle 
     *    mittlere Element sein, so wird der Startpunkt neu gesetzt:
     *    - Startpunkt = Mitte + 1
     * 5. Sollte das gesuchte Element kleiner als das akutelle 
     *    mittlere Element sein, so wird der Enpunkt neu gesetzt:
     *    - Endpunkt = Mitte - 1
     * 
     * @param array
     * @param i
     */
    private static void binarySearch(int[] array, int i) {
        int iLeft = 0, iRight = array.length - 1, iCenter = 0, iIter = 0;
        boolean bFound = false;

        while (iLeft <= iRight) {
            iIter += 1;
            iCenter = iLeft + (iRight - iLeft) / 2;

            if (array[iCenter] == i) {
                bFound = true;
                break;
            } else if (array[iCenter] < i) {
                iLeft = iCenter + 1;
            } else if (array[iCenter] > i) {
                iRight = iCenter - 1;
            }
        }

        if (bFound) {
            System.out.printf("Element gefunden! Es befindet sich beim Index %d.\n", iCenter);
            System.out.printf("Insgesamt wurden %d Schleifendurchläufe gebraucht. (%d Elemente im Array)", iIter,
                    array.length);

        } else {
            System.out.println("Element wurde nicht gefunden!");
        }
    }
}
