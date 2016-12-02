
package ejercicio.pkg9.psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julian
 */
public class Multiplos_cinco extends Thread {
    public int numerovariable;
    public int suma_multiplos_cinco;

    public Multiplos_cinco() {
        this.numerovariable = numerovariable;
    }

    public Multiplos_cinco(int numerovariable) {
        this.numerovariable = numerovariable;
    }

    
    public int getSuma_multiplos_cinco() {
        return suma_multiplos_cinco;
    }
   
    
     @Override
   public void run(){
       /**
        * Le pongo el sleep para que de tiempo a darle un valor por teclado al factorial lo mismo para los otros hilos.
        */
        try {
            sleep(6000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Multiplos_cinco.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       while(suma_multiplos_cinco<1000){
           
           if(5%numerovariable==0){
               suma_multiplos_cinco=numerovariable+suma_multiplos_cinco;
               
           }
           
           
           
      
       
       }
       System.out.println("Sumdo los multiplos de 5");
       
       
       
        
   }
    
    
}
    
    

