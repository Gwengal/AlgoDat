package Kapitel_02.Aufgabe_04;

public class Tuerme {
    public static void main(String[] args) {
        System.out.println(Tuerme.rec(31));   
        System.out.println(Tuerme.iter(31));     
    }

    public static int iter(int n){
        int iAmount = 1;

        while (n != 1) {
            iAmount = 2 * iAmount + 1;
            n = n - 1;            
        }

        return iAmount;
    }

    public static int rec(int n){
        if (n == 1) {
            return 1;
        }

        return 2 * Tuerme.rec(n-1) + 1;
    }
}
