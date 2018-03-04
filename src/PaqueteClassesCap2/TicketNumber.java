package PaqueteClassesCap2;

import javax.swing.JOptionPane;
public class TicketNumber {

    public void ejecutar() {
        final float CONS=7F;
        Integer numTicket, remove, last;
        
        numTicket=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero del ticket (6 dígitos)","Travel Company",JOptionPane.QUESTION_MESSAGE));
        remove=numTicket/10;
        last=numTicket%10;
        JOptionPane.showMessageDialog(null, (last==(remove%CONS)));
           
    }
}