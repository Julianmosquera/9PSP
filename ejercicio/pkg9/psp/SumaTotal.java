
package ejercicio.pkg9.psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julian
 */
public class SumaTotal extends Thread{

  
    
    public int sumatotal;
    

    

  

    public SumaTotal() {
        this.sumatotal = sumatotal;
    }

  
    

    
    @Override
    public void run() {
        
                
            /**
             * Esta clase tiene el sleep mas largo dado que es el ultimo que tiene que entrar para
             * que primero se ejecuten las de sumas de multiplos necesarias para poder calcular este total.
             */
       
        
         
//        try {
//            sleep(9000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(SumaTotal.class.getName()).log(Level.SEVERE, null, ex);
//            
//        }
        sumatotal=Multiplos_tres.suma_multiplos_tres+Multiplos_cinco.suma_multiplos_cinco;
        
        System.out.println("La suma total es de "+sumatotal);
   
        
        
         
    }
    
    
}
