package PaqueteClassesCap2;

public class ProjectedSales {

    public void ejecutar() {
        final float PERCENT=1.10f;
        float northSales=4500.99f, southSales=5600.75f;
        System.out.println("Las ventas proyectadas para el siguiente a�o de la división norte son "+(northSales*PERCENT)+
                " dlls y para la división sur son "+(southSales*PERCENT)+" dlls");
    }
    
}