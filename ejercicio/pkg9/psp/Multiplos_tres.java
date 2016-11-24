
package ejercicio.pkg9.psp;

/**
 *
 * @author julian
 */


public class Multiplos_tres extends Thread{
  /**
   * El primer hilo sumará los múltiplos de 3 del 1 al 1000
   */
    
    public int numerovariable;
    public int suma;

    public Multiplos_tres(int numerovariable) {
        this.numerovariable = numerovariable;
    }

    

   
      
    
     @Override
   public void run(){
       
       while(suma<1000){
           
           if(3%numerovariable==0){
               suma=numerovariable+suma;
           
           }
          
           System.out.println("La suma de los multiplos de 3 es: "+suma);
      
       
       }
       
       
       
        
   }
    
    
}
