package numerosprimos;


import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class NumerosPrimos {

    public static void main(String[] args) {
   int numeros[] = new int[5];
   Scanner sc = new Scanner(System.in);
   String salida = "";
   int  num, dir, aux=0;
   


 for(int a= 0; a < numeros.length ; ){
 
   System.out.print( "\tPor favor ingrese un numero que sea primo y no multiplo de 7 :" );
    num = sc.nextInt();
 // Evalua el numero  
   aux += (num==7) ? 1 : 0 ;  
               
   if( EvaluaNumeros.esPrimo(num) && EvaluaNumeros.esMultiploSiete(num) )
  
       {
          
  System.out.println( "El numero es primo y no es multiplo de 7" );
   //Guarda en alguna direccion de memoria
   try{   
   System.out.print( " Escribe un numero de direccion de memoria que deseas guardar 0 - 9914 " );
   System.out.print( " Procura de no repetir este valor: " );
   dir = sc.nextInt();

   if( numeros[ dir ] == 0 )
   {
   numeros[ dir ] = num;
   a++;
   }
   else
       JOptionPane.showMessageDialog(null, "Este espacio ya esta ocupado" );
        EvaluaNumeros.limpiar(20);
   }
   catch (ArrayIndexOutOfBoundsException e) {
       JOptionPane.showMessageDialog(null, "Error este espacio de memoria no esta disponible." +
                "por favor ingresa otro valor correcto");

    }
   finally {
    
EvaluaNumeros.limpiar(20);
// Opcional. Aquí va el código que va a ejecutarse siempre, tanto si se produce excepción como si no se produce.
}
   }
   

   else
   {
  JOptionPane.showMessageDialog(null, "El numero no es primo o es multiplo de 7 ingrese otro numero");
  a+=0;
   }
  

}
 
 for(int vc = 0; vc < numeros.length ; vc++)
 {
 salida +=  Integer.toString( numeros[vc] );
 
 }
 
  JOptionPane.showMessageDialog(null, "Los numeros intrucidos fueron :" + salida + "," + 
         "\n Y se intento ingreso el numero 7 :" + aux + " veces");
 
  }
    
}
