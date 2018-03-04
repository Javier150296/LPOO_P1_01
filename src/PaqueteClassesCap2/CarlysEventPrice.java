package PaqueteClassesCap2;

import java.util.Scanner;

public class CarlysEventPrice {

    public void ejecutar() {
	final Integer PRICE=35;
	Integer guests;
	Scanner entrada=new Scanner(System.in);
	
	System.out.print("Número de invitados al evento >>");
	guests=entrada.nextInt();
        System.out.println("************************************************");
        System.out.println("* Carly's makes the food that makes it a party *");
        System.out.println("************************************************");
	System.out.println("\n\nInvitados: "+guests+"\nPrecio por invitado: $"+PRICE+"\nTotal: $"+(PRICE*guests));
	if(guests>=50){
		System.out.println("\nEvento grande");
	}else{
		System.out.println("\nEvento pequeño");
	}
    }
    
}