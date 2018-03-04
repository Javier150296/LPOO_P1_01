
package CAPITULO_03;

/**
 *
 * @author JAVIER1
 */
public class Ejercicio_02 {
    public static void main(String[] args) {
        System.out.println("2. Supón que una clase llamada ClassA contiene un entero privado no estático llamado b, un entero público no estático llamado c, y un entero público estático llamado d.\n" +
"   Cuál de las siguentes declaraciones en una clase llamada ClassB que ha sido instanciada en un objeto como ClassA obA=new ClassA(); son legales?\n" +
"\n" +
"a. obA.b=12;	Ilegal\n" +
"b. obA.c=5;	Legal\n" +
"c. obA.d=23;	Legal\n" +
"d. ClassA.b=4;	Ilegal\n" +
"e. ClassA.c=33;	Ilegal\n" +
"f. ClassA.d=99; Legal	");
    }
}
