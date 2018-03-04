package PaqueteClassesCap2;

import java.util.Scanner;
public class SammysRentalPrice {

    public void ejecutar() {
        final Integer PRICE=40;
        Integer minutes, perMin, perHr=0;
        Scanner entrada= new Scanner(System.in);
        
        System.out.print("Minutos de renta del equipo >>");
        minutes=entrada.nextInt();
        if(minutes/60>1){
            perHr=(minutes/60)*PRICE;
            perMin=minutes%60;
        }else
            perMin=minutes;
        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S  Sammy's makes it fun in the sun  S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("\nUsó el equipo "+(minutes/60)+" hrs y "+perMin+" minutos\nCosto total: $"+(perHr+perMin));
    }
}