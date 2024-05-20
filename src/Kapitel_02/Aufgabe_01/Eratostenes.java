package Kapitel_02.Aufgabe_01;

public class Eratostenes {
    public static void main(String[] args) {
        int[] aNumbers = Eratostenes.init(50);
        Eratostenes.siebe(aNumbers);
    }   

    /**
     * Initialisierung und Rückgabe eines Integer-Arrays
     * 
     * @param n
     * @return
     */
    private static int[] init(int n){
        int[] aNumbers = new int[n+1];

        for (int i = 0; i < aNumbers.length; i++) {
            if (i < 2) {
                aNumbers[i] = 0;  
                continue;              
            }

            aNumbers[i] = i;                        
        }

        return aNumbers;
    }

    /**
     * Sieb des Eratosthenes
     * 1. Äußere Schleife fängt bei 2 an (da 0 und 1 keine Primzahl)
     * 2. Äußere Schleife läuft bis Wurzel arr.length (Anzahl Elemente)
     * 3. Wenn der Wert im Index i != 0 ist == Primzahl
     * 4. Innere Schleife startet ab i² und iteriert um ein i jeweils weiter und 
     *    streicht die nicht Primzahlen raus
     * 5. Die letzte Schleife gibt aus ob es sich beim Index (repräsentat für die aktuelle Zahl)
     *    um eine Primzahl handelt oder nicht
     * 
     * @param arr
     */
    private static void siebe(int[] arr){
        for (int i = 2; i*i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = i*i; j < arr.length; j += i) {
                    arr[j] = 0;                    
                }                
            }            
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ist %s Primzahl.\n", i, (arr[i] == 0 ? "keine" : "eine"));            
        }
    }
}
