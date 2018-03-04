package PaqueteClassesCap2;

import java.util.Scanner;
public class InchesToFeet {

    public void ejecutar() {
        final Integer FEET=12;
        Integer inches, sobrante;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Pulgadas: ");
        inches=entrada.nextInt();
        sobrante=inches%FEET;
        if(sobrante>0){
            System.out.println(inches+" pulgadas es equivalente a "+(inches/FEET)+" pies y "+sobrante+" pulgadas");
        }else{
            System.out.println(inches+" pulgadas es equivalente a "+(inches/FEET)+" pies");
        }
    }
    
}