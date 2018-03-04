package PaqueteClassesCap3;

public class ArithmeticMethods {
    public static void displayNumberPlus10(Integer A, Integer B){
        System.out.println("Primer entero + 10 >>"+(A+10));
        System.out.println("Segundo entero + 10 >>"+(B+10));
    }
    public static void displayNumberPlus100(Integer A, Integer B){
        System.out.println("Primer entero + 100 >>"+(A+100));
        System.out.println("Segundo entero + 100 >>"+(B+100));
    }
    public static void displayNumberPlus1000(Integer A, Integer B){
        System.out.println("Primer entero + 100 >>"+(A+1000));
        System.out.println("Segundo entero + 100 >>"+(B+1000));
    }
    
    public void ejecutar() {
        Integer numUno=5, numDos=7;
        displayNumberPlus10(numUno,numDos);
        displayNumberPlus100(numUno,numDos);
        displayNumberPlus1000(numUno,numDos);
    }
}