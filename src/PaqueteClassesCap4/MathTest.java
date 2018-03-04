package PaqueteClassesCap4;

public class MathTest {
   
    public static void ejecutar() {
        System.out.println("Raíz cuadrada de 37 >>"+Math.sqrt(37.0));
        System.out.println("Sen(300) >>"+Math.sin(300.0));
        System.out.println("Cos(300) >>"+Math.cos(300.0));
        System.out.println("Floor de 22.8 >>"+Math.floor(22.8));
        System.out.println("Ceiling de 22.8 >>"+Math.ceil(22.8));
        System.out.println("Redondedo de 22.8 >>"+Math.round(22.8));
        System.out.println("Máximo entre D y 71 >>"+Math.max('D',71));
        System.out.println("Mínimo entre D y 71 >>"+Math.min('D',71));
        System.out.println("Random entre 1 y 20 >>"+Math.random()*20);
        
    }
}