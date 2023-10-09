
package javaapplication1;

import java.util.Scanner;


public class exercicio5 {
    public static void main(String[] args) {
        
        
        maiorMenor();
        
        
    }
    
    public static void maiorMenor(){
    
        int maiorN = 0;
        int menorN = 0;
        int numeros = 0;
        
        Scanner teclado = new Scanner(System.in);

        
        for(int i = 0; i <= 4; i++){
            
            numeros = teclado.nextInt();
            
            if(i == 0){
                menorN = numeros;
                maiorN = numeros;
            }else if(numeros > maiorN){
                maiorN = numeros;
            }else if(numeros < menorN){
                menorN = numeros;
            }
        }
        
        System.out.println(maiorN + " - " + menorN);
        
    }
    
}
