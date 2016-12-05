
package ejercicio.pkg9.psp;

/**
 *
 * @author julian Mosquera
 */
public class Ejercicio9PSP {

    
    public static void main(String[] args) throws InterruptedException {
        Multiplos_tres multi3 = new Multiplos_tres();
        multi3.setPriority(8);
        
        
        Multiplos_cinco multi5 = new Multiplos_cinco();
        multi5.setPriority(8);
        
        Factorial fac = new Factorial();
        fac.setPriority(10);
        
        
        SumaTotal stotal=new SumaTotal();
        stotal.setPriority(1);
        fac.start();
        
        multi3.start();
        multi5.start();
        
       stotal.start();
        
    }

}
