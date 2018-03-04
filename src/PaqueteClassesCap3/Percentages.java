package PaqueteClassesCap3;

public class Percentages {

    public static Double computePercent(Double A, Double B){
        return B*100/A;
    }
    
    public void ejecutar() {
        Double numUno=2.0, numDos=5.0;
        Integer percent;
        System.out.println(numUno+" es el "+computePercent(numDos,numUno)+"% de "+numDos);
        System.out.println(numDos+" es el "+computePercent(numUno,numDos)+"% de "+numUno);
    }
}
