package PaqueteClassesCap3;

import java.util.Scanner;

public class EventDemo {

    public static void ejecutar() {
	Event eventoNuevo=new Event();
	
	eventoNuevo.setGuests(getInvitados());
	eventoNuevo.setEventNumber(getEventNumber());
	CarlysEventPriceWithMethods.displayMotto();
	CarlysEventPriceWithMethods.displayEvent(eventoNuevo.getGuests());
    }


	public static Integer getInvitados(){
		Scanner entrada=new Scanner(System.in);
	
		System.out.print("Número de invitados al evento >>");
		return entrada.nextInt();
	}
	public static String getEventNumber(){
		Scanner entrada=new Scanner(System.in);
	
		System.out.print("Número del evento >>");
		return entrada.nextLine();
	}
    
}