
package punto3;

import java.util.Scanner;


public class Punto3 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int contador = 1, suma = 0, valor, promedio;
        
         while (contador <=5){ 
         
             System.out.println("Inserte un valor :");
             valor = leer.nextInt(); 
             suma = suma + valor;
             contador ++;
         }
     promedio=suma/5; 
        System.out.println("La suma total de los valores es :"+suma);
         System.out.println("El promedio total es :"+promedio);
    }
    
}
