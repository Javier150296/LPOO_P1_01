package PaqueteClassesCap3;

import java.util.Scanner;
public class PaintCalculator {
    
    public static Double calcArea(Double ancho, Double largo, Double alto){
        return (alto*ancho*2)+(alto*largo*2);
    }
    public static Double galones(Double area){
        System.out.println(String.format("%s %.3f", "Galones necesarios ",(area/350)));
        return area/350;
    }
    public static Double totalPrice(Double gal){
        return gal*32;
    }
    public void ejecutar() {
        Double length, width, height, price;
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ancho >>");
        width=entrada.nextDouble();
        System.out.print("Largo >>");
        length=entrada.nextDouble();
        System.out.print("Alto >>");
        height=entrada.nextDouble();
        price=totalPrice(galones(calcArea(width,length,height)));
        System.out.println(String.format("%s %.1f %s %.1f %s %.1f %s %.2f",
                "El costo para pintar un cuarto de ",width," por ",length," pies con ",height," pies de altura es $",price));
    }
}