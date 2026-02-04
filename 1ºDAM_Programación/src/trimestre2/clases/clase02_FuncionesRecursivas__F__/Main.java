package trimestre2.clases.clase02_FuncionesRecursivas__F__;

public class Main {

	//  Secuencia Fibonacci

 public static void main(String[] args) {
  ejercicio_recursivo();
 }
public static int fibonacci(int n) {
 if (n <= 1)
  return n;
	
	
 int a = 0; int b=1;
 for(int i = 2; i<= n; i++) {
  int c = a + b;
  a = b;
  b=c;
 }
 return b;
	
}

public static void ejercicio_recursivo(){
	
        int n = 10; 
  
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + ""+",");
        }
    }

    public static int fibonacci1(int n) {
       
        if (n <= 1)
         return n;
       
       
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


public static void main1(String[] args) {
 int i=0;
 while(i<=20) {
  i = sumar(i); 
 }
 System.out.println(i);
	
}
public static int sumar(int i) {
 return ++i;
}
public static int sumar(int i, int total) {
 System.out.println(i);
 if(i==total)
  return i;
 return total;
	

}
}

