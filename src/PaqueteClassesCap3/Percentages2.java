package PaqueteClassesCap3;

import java.util.Scanner;

public class Percentages2 {
    public static Double computePercent(Double A, Double B){
        return B*100/A;
    }
    
    public void ejecutar() {
        Double numUno, numDos;
        Integer percent;
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Numero Uno >>");
        numUno=entrada.nextDouble();
        System.out.print("Numero Dos >>");
        numDos=entrada.nextDouble();
        System.out.println(numUno+" es el "+computePercent(numDos,numUno)+"% de "+numDos);
        System.out.println(numDos+" es el "+computePercent(numUno,numDos)+"% de "+numUno);
    }
}