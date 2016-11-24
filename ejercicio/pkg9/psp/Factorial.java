
package ejercicio.pkg9.psp;
import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Factorial extends Thread{
    /**
     * El tercero el factorial de un número introducido por teclado
     */
    double factorial=1;
    
    
    Scanner s=new Scanner(System.in);
    int numero=s.nextInt();
    
    @Override
    public void run(){
        System.out.println("Inroduce el numero: ");
    Scanner s=new Scanner(System.in);
    int numero=s.nextInt();    
        
     while ( numero!=0) {
      factorial=factorial*numero;
      numero--;
         System.out.println(factorial);
    }
        
    }
    
    
    
    
    
    
}
