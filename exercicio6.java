
package javaapplication1;

public class exercicio6 {
    
    public static void main(String[] args) {
        System.out.println(progressao(5));
        
    }
    
    
    public static double progressao(int numero){
        double s = 0;
        double fatorial = 2;
       int cont;
        
        
        for(int i =1; i <= numero; i++){
            
            cont = i;
            
            if (i == 1){
                fatorial = 1;
            }else{
                 while(cont > 0){    
                if(cont == i){
                    fatorial = cont * (cont-1);
                }else{
                  
                    if(cont - 1 > 0){
                        fatorial = fatorial * (cont-1);      

                    }
                }
                cont --;
            }
            }
            
            if(i == 1){
              s += 1 + 1 / fatorial;  
            }else{
              s += 1 / fatorial;  
            }
        }
          
        return s;
    }
    
    
}
