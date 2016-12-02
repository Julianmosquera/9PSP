
package ejercicio.pkg9.psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julian
 */


public class Multiplos_tres extends Thread{
  /**
   * El primer hilo sumará los múltiplos de 3 del 1 al 1000
   */
    
    public int numerovariable;
    public int suma_multiplos_tres;

    public Multiplos_tres() {
        this.suma_multiplos_tres = suma_multiplos_tres;
    }

    public Multiplos_tres(int numerovariable) {
        this.numerovariable = numerovariable;
    }


    
    
    

    public int getSuma_multiplos_tres() {
        return suma_multiplos_tres;
    }

    

   
      
    
     @Override
   public void run(){
        try {
            sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Multiplos_tres.class.getName()).log(Level.SEVERE, null, ex);
        }
       while(suma_multiplos_tres<1000){
           
           if(3%numerovariable==0){
               suma_multiplos_tres=numerovariable+suma_multiplos_tres;
           
           }
          
           
      
       
       }
       System.out.println("sumado los multiplos de tres");
       
       
        
   }
    
    
}
