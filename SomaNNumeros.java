
package javaapplication1;
import javax.swing.JOptionPane;


public class SomaNNumeros {
    public static void main(String[] args) {
         int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero: ", "INSIRA", JOptionPane.DEFAULT_OPTION));
         int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero: ", "INSIRA", JOptionPane.DEFAULT_OPTION));

         JOptionPane.showMessageDialog(null,SomaNumero(numero, numero2), "Saida", JOptionPane.INFORMATION_MESSAGE);    

    }
    
    public static int SomaNumero(int num, int num2){
        int soma = 0;
        if(num < num2){  
            for(int i = num+1;i <= num2-1; i++ ){
                soma += i;
            }   
        }else{
            for(int i = num2+1;i <= num-1; i++ ){
               soma += i;
            }
        }
        
        
        return soma;
    }
}
