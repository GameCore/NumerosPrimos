package numerosprimos;

public class EvaluaNumeros
{
    
 public static boolean esPrimo(int numero){
  int contador = 2;
  boolean primo=true;
  while ((primo) && (contador!=numero)){
    if (numero % contador == 0)
      primo = false;
    contador++;
  }
  return primo;
}
 
  public static boolean esMultiploSiete(int numero){
  boolean mul=false;
  int res = ( numero % 7);
if ( res == 0 ){
      return mul;
  }
  else{
  mul = true;
  return mul; 
}
}
  
 

public static void limpiar(int lineas)
{
for (int i=0; i < lineas; i++)
{
System.out.println();
}
}

}