package Kapitel_03.Aufgabe_03;

public class Reallocation {
    public static void main(String[] args) {
        int[] aInt = new int[10];
        Reallocation.fillArray(aInt);
        System.out.println("Nicht erweitertes Array: ");
        Reallocation.printArray(aInt);

        System.out.println("\nErweitertes Array: ");
        aInt = Reallocation.reallocate(aInt, 20);
        Reallocation.printArray(aInt);
    }

    private static int[] reallocate(int[] aInt, int iAmount){
        int[] aNew = new int[aInt.length + iAmount];

        for (int i = 0; i < aInt.length; i++) {
            aNew[i] = aInt[i];
        }

        return aNew;
    }

    private static void fillArray(int[] aInt){
        for (int i = 0; i < aInt.length; i++) {
            aInt[i] = (int)(Math.random()*10) + 1;
        }
    }

    private static void printArray(int[] aInt){
        for (int i = 0; i < aInt.length; i++) {
            System.out.printf("%d, ", aInt[i]);
        }
    }
}
