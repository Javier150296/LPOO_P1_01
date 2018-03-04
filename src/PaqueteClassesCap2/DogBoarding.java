package PaqueteClassesCap2;

import javax.swing.JOptionPane;
public class DogBoarding {

    public void ejecutar() {
        final float PRICE=0.5f;
        double peso;
        Integer dias;
        
        peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Peso del perro en libras","Happy Yappy Kennel",JOptionPane.QUESTION_MESSAGE));
        dias=Integer.parseInt(JOptionPane.showInputDialog(null,"Días a alojar","Happy Yappy Kennel",JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null,String.format("%s %d %s %.2f","El costo total por alojar el perro ",dias," días es ",(peso*dias*PRICE)));
               
    }
}