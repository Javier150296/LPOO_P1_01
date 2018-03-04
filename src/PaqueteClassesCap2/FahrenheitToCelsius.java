package PaqueteClassesCap2;

import javax.swing.JOptionPane;
public class FahrenheitToCelsius {

    public void ejecutar() {
        final float CONS=5/9F;
        double Fahrenheit;
        
        Fahrenheit=Double.parseDouble(JOptionPane.showInputDialog(null,"Grados Fahrenheit","Conversion a Celcius",JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null,String.format("%.1f %s %.1f %s",
                Fahrenheit," grados Fahrenheit es igual a ",(Fahrenheit-32)*CONS," grados Celsius"));
               
    }
}