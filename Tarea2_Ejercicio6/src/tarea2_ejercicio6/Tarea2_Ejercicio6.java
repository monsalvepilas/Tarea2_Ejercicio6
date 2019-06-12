

package tarea2_ejercicio6;

import java.util.Scanner;

public class Tarea2_Ejercicio6 {

    public static void main(String[] args) {
        
                
      	Scanner EntradaDatosRectanculo = new Scanner(System.in);

		int alto = 0;
		int ancho = 0;
                int dibujar=0;
                int contador=0;

		System.out.println("Solo puedes valores entre 1 y 20 ");

		do {

			System.out.print("Introduce el alto del rectángulo: ");

			alto = EntradaDatosRectanculo.nextInt();

			if ((alto < 1) || (alto > 20)) {

				System.out.println("HAS INTRODUCIDO UN VALOR NO VÁLIDO, POR FAVOR, INTRODUZCA DATOS CORRECTOS ");
			}
		}

		while ((alto < 1) || (alto > 20));

		do {

			System.out.print("Introduce el ancho del rectángulo: ");

			ancho = EntradaDatosRectanculo.nextInt();

			if ((ancho < 1) || (ancho > 20)) {

				System.out.println("HAS INTRODUCIDO UN VALOR NO VÁLIDO, POR FAVOR, INTRODUZCA DATOS CORRECTOS ");
			}

		} while ((ancho < 1) || (ancho > 20));

		if ((alto == 0) || (ancho == 0)) {

			System.out.print("Es imposible construir un rectángulo sin lados. El programa finalizará ");
			System.exit(0);

		}


                
                
                
                for (contador = 1; contador < ancho+1; contador++) {
                    
                     
                    if ((contador==1)||(contador==ancho)){
                        
                        System.out.print("+");
                         
                     }else {
                        
                        System.out.print("-");
                    }
            
        }
                 System.out.println("");
                 
                
                 for (int contador1 = 1; contador1 < alto-1; contador1++) {
                     
                      
                     
                     
                     
                     System.out.print("|");
                      
                     
                        
                        
                    
                    
                        
                        
                     
                      
                      
                      
                      for (int contador2 = 1; contador2 < ancho-1; contador2++) {
                          
                        
                          
                          if ((contador2==1)||(contador2==ancho-2)){
                        
                        System.out.print("*");
                        
                          }else if ((contador1==1)||(contador1==alto-2)){
                                
                             
                              System.out.print("*");
                     }else {
                            System.out.print(" ");
                            
                            }
     
                          
                      }
                      
                      System.out.print("|");
                      
                       System.out.println("");
                      
                 }
                 
                 
                 
            
        for (contador = 1; contador < ancho+1; contador++) {
                    
                     
                    if ((contador==1)||(contador==ancho)){
                        
                        System.out.print("*");
                         
                     }else {
                        
                        System.out.print("-");
                    }
            
        }
        
        System.out.println("");
                
                

	}

} 



		