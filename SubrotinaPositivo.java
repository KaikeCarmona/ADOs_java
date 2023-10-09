
package javaapplication1;

import javax.swing.JOptionPane;

public class SubrotinaPositivo {
    public static void main(String[] args) {
        
       int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero: ", "INSIRA", JOptionPane.DEFAULT_OPTION));
       JOptionPane.showMessageDialog(null,RetornaPositivoNegativo(numero), "Saida", JOptionPane.INFORMATION_MESSAGE);    
    }
    
    public static int RetornaPositivoNegativo(int num){
        if(num < 0 ){
            return 0;
        }else{
            return 1;
        }
    }
}
