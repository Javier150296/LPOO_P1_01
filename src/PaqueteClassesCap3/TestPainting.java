package PaqueteClassesCap3;

public class TestPainting {
   
    public void ejecutar() {
        Painting pin1=new Painting();
        Painting pin2=new Painting();
        Painting pin3=new Painting();
        
        pin1.setData();
        pin2.setData();
        
        pin1.showValues();
        pin2.showValues();
        pin3.showValues();
        
        Painting.commRate();
    }
    
}