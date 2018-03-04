package PaqueteClassesCap3;

import java.util.Scanner;

public class MetricConversion {
    
    public static void conversionCm(Integer A){
        Double centimetros;
        centimetros=A*2.54;
        System.out.println(String.format("%s %d %s %.2f %s","En ",A," pulgadas hay ",centimetros," centímetros"));
    }
    public static void conversionLt(Integer A){
        Double litros;
        litros=A*3.7854;
        System.out.println(String.format("%s %d %s %.4f %s","En ",A," galones hay ",litros," litros"));
    }
    
    public void ejecutar() {
        Integer cantidad;
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Pulgadas o Galones >>");
        cantidad=entrada.nextInt();
        conversionCm(cantidad);
        conversionLt(cantidad);
    }
}