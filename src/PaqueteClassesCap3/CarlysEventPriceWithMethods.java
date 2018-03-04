package PaqueteClassesCap3;

import java.util.Scanner;

public class CarlysEventPriceWithMethods {
    public static void ejecutar() {
	Integer guests;
	
	guests=getInvitados();
	displayMotto();
	displayEvent(guests);
    }
	public static Integer getInvitados(){
		Scanner entrada=new Scanner(System.in);
	
		System.out.print("Número de invitados al evento >>");
		return entrada.nextInt();
	}
	public static void displayMotto(){
		System.out.println("************************************************");
        	System.out.println("* Carly's makes the food that makes it a party *");
        	System.out.println("************************************************");
	}
	public static void displayEvent(Integer guests){
		final Integer PRICE=35;
		System.out.println("\n\nInvitados: "+guests+"\nPrecio por invitado: $"+PRICE+"\nTotal: $"+(PRICE*guests));
		if(guests>=50){
			System.out.println("\nEvento grande");
		}else System.out.println("\nEvento pequeño");
	}
    
}