package PaqueteClassesCap2;

import javax.swing.JOptionPane;

public class MilesToFeetInteractive {

    public void ejecutar() {
        final Integer FEET_IN_MILE=5280;
        double distance;
        distance=Double.parseDouble(JOptionPane.showInputDialog(null,"Distancia a la casa del tía en millas?",JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, "La distancia a la casa del tía es "+distance+" millas o "+(distance*FEET_IN_MILE)+" en pies");
    }
    
}