
package ejercicio.pkg9.psp;

/**
 *
 * @author julian
 */
public class Multiplos_cinco extends Thread {
     public int numerovariable;
    public int suma;

    public Multiplos_cinco(int numerovariable) {
        this.numerovariable = numerovariable;
    }
   
    
     @Override
   public void run(){
       
       while(suma<1000){
           
           if(5%numerovariable==0){
               suma=numerovariable+suma;
               
           }
           
           System.out.println("La suma de los multiplos de 5 es: "+suma);
           
      
       
       }
       
       
       
        
   }
    
    
}
    
    

