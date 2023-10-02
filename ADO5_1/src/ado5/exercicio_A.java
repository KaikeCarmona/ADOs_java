package ado5;

import javax.swing.JOptionPane;
 
public class exercicio_A {
    
    public static void main(String[] args) {
        double valorVenda ;
        
        //input dos dados: nome do produto e valor do produto.
        String nome_product = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
        String valor_product = JOptionPane.showInputDialog(null, "Digite o preço do produto:");
        
        // Converte para double o valor do produto
        double converte_b = Double.parseDouble(valor_product);
        
        
        // Faz o calculo de porcentagem encima do valor do produto.
        if(converte_b < 20){
            valorVenda = converte_b + ((45 * converte_b)/100);
            //imprime na tela o nome do produto e o valor dele.
            JOptionPane.showMessageDialog(null,"O preço de revenda do produto " + nome_product + " e " + valorVenda, "Valor de revenda:", 1);
        }else{
            valorVenda = converte_b + ((30 * converte_b)/100);
            JOptionPane.showMessageDialog(null,nome_product + valorVenda, "Valor de revenda", 1);
        }
        
        
     }
    
}
