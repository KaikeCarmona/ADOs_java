package ado5;
import javax.swing.JOptionPane;

public class exercicio_B {
    
    public static void main(String[] vargs){
        String name = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        String idade = JOptionPane.showInputDialog(null, "Digite a sua idade:");

        double idadeConvert = Double.parseDouble(idade);

        if(idadeConvert <= 10){
                JOptionPane.showMessageDialog(null,name + " - " + idade + " - valor do convenio -> R$ 30,00" , "Seu convenio", 1);
        }else if(idadeConvert > 10 && idadeConvert <= 29){
                JOptionPane.showMessageDialog(null,name + " - " + idade + " - valor do convenio -> R$ 60,00" , "Seu convenio", 1);
        }else if(idadeConvert > 29 && idadeConvert <= 45){
                JOptionPane.showMessageDialog(null,name + " - " + idade + " - valor do convenio -> R$ 120,00" , "Seu convenio", 1);
        }else if(idadeConvert > 45 && idadeConvert <= 59){
                JOptionPane.showMessageDialog(null,name + " - " + idade + " - valor do convenio -> R$ 150,00" , "Seu convenio", 1);
        }else if(idadeConvert > 59 && idadeConvert <= 65){
                JOptionPane.showMessageDialog(null,name + " - " + idade + " - valor do convenio -> R$ 250,00" , "Seu convenio", 1);
        }else if(idadeConvert > 65){
                JOptionPane.showMessageDialog(null,name + " - " + idade + " - valor do convenio -> R$ 400,00" , "Seu convenio", 1);
        }
    }
}
