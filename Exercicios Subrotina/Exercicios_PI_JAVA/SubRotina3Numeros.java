
package javaapplication1;

public class SubRotina3Numeros {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 6;
        
        System.out.println(Divisao(a,b,c));
    }
    
    
public static int Divisao(int a, int b, int c){
    int resultado = 0;
    
     if(b < c){  
            
         for(int i = b;i <= c; i++ ){
             if(i % a == 0){
                    resultado +=i;
                }
            }   
      }else{
            for(int i = c;i <= b; i++ ){
                if(i % a == 0){
                    resultado +=i;
                }
                
            }
        }
    
    
    return resultado;
    
}
}
