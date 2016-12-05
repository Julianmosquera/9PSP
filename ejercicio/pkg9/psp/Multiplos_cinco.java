package ejercicio.pkg9.psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julian
 */
public class Multiplos_cinco extends Thread {

    
    public static int suma_multiplos_cinco;
    

    public Multiplos_cinco() {
        
    }

   

    @Override
    public void run() {
        
            /**
             * Le pongo el sleep para que de tiempo a darle un valor por teclado al
             * factorial lo mismo para los otros hilos.
             */
        try {
            sleep(6000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Multiplos_cinco.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       
        for (int i = 0; i < 1000; i++) {
            if (i%3==0) {
                suma_multiplos_cinco = suma_multiplos_cinco+ i;

            }
            
            
            i++;
        }System.out.println("Sumado los multiplos de cinco");
    }
            
    
        
        
       
    

    public int getSuma_multiplos_cinco() {
        return suma_multiplos_cinco;
    }
}

