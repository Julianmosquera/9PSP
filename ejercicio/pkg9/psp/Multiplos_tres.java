package ejercicio.pkg9.psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julian
 */
public class Multiplos_tres extends Thread {

    /**
     * El primer hilo sumará los múltiplos de 3 del 1 al 1000
     */

    
    public static int suma_multiplos_tres;
    

    public Multiplos_tres() {
        
    }

    

    
    
    @Override
    public void run() {
        
        
        try {
           sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Multiplos_tres.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < 1000; i++) {
            
        
            if (i%3== 0) {
              suma_multiplos_tres=suma_multiplos_tres+i;
            
            }
                
            i++;
        }
        
        System.out.println("Sumando los multiplos de tres");
        

    }
    
    

}
