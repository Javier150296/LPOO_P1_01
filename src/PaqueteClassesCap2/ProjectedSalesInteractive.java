package PaqueteClassesCap2;

import javax.swing.JOptionPane;

public class ProjectedSalesInteractive {

    public void ejecutar() {
        final float PERCENT=1.10f;
        double northSales, southSales;
        northSales=Double.parseDouble(JOptionPane.showInputDialog(null,"Ventas de la división Norte: "));
        southSales=Double.parseDouble(JOptionPane.showInputDialog(null,"Ventas de la división del Sur: "));
        JOptionPane.showMessageDialog(null,String.format("%s %.2f %s %.2f %s","Las ventas proyectadas para el siguiente año de la división Norte son ",(northSales*PERCENT),
                " dlls\n Para la división Sur son ",(southSales*PERCENT)," dlls"));
    }
    
}