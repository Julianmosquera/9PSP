
package ejercicio.pkg9.psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julian
 */
public class SumaTotal extends Thread{

    Multiplos_tres tres=new Multiplos_tres();
    Multiplos_cinco cinco=new Multiplos_cinco();
    
    @Override
    public void run() {
        try {
            sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SumaTotal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(tres.getSuma_multiplos_tres());
        System.out.println(cinco.getSuma_multiplos_cinco());
        
        int sumatotal=(tres.getSuma_multiplos_tres())+(cinco.getSuma_multiplos_cinco());
        
        System.out.println("La suma total es de "+sumatotal);
    }
    
    
}
