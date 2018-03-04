package PaqueteClassesCap2;

import javax.swing.JOptionPane;
public class InchesToFeetInteractive{

    public void ejecutar() {
        final Integer FEET=12;
        Integer inches, sobrante;
        inches=Integer.parseInt(JOptionPane.showInputDialog(null,"Pulgadas",JOptionPane.INPUT_VALUE_PROPERTY));
        sobrante=inches%FEET;
        if(sobrante>0){
            JOptionPane.showMessageDialog(null,inches+" pulgadas es equivalente a "+(inches/FEET)+" pies y "+sobrante+" pulgadas");
        }else{
            JOptionPane.showMessageDialog(null,inches+" pulgadas es equivalente a "+(inches/FEET)+" pies");
        }
    } 
}