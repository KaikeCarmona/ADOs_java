import javax.swing.*;

public class ADO6 {
    
    public static void menu() {
        double a = 0, b = 0, c = 0, sp = 0;
        char TECLA = '0';
        String tipo = ""; 
        String menu = "---- menu de controle ----\n1 - Executar Programa\n2 - Sair\nItem:";
        
        //se o while for true, ele continua executanto até ser encerrado por um break
        while (true){
            String nMenu = JOptionPane.showInputDialog(null, menu); //inicializa o menu do programa
            TECLA = nMenu.charAt(0); //converte o numero inserido no input para char, para poder usa-la no switch
            switch(TECLA){ //tratamento do valor da variavel tecla
                case'1':  
                //caso ela seja de valor 1, executa o calculo do triangulo:
                    
                    a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do primeiro lado do triangulo:"));
                    
                    b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do segundo lado do triangulo:"));
                    
                    c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do terceiro lado do triangulo:"));  
                    
                    JOptionPane.showMessageDialog(null, a +" "+ b +" "+ c);
                    
                    if(a>=b+c || b>=a+c || c>=a+b || a<=0 || b<=0 || c<=0){
                        JOptionPane.showMessageDialog(null, "Erro! Lados Invalidos!");
                    }
                    else{
                        sp = (a+b+c)/2;
                        if(a==b && b==c){
                            tipo = "Equilatero";
                            JOptionPane.showMessageDialog(null, "O triangulo é: "+ tipo + "\n A área do triangulo é: " + sp);
                        }else if(a!=b && a!=c && b!=c ){
                            tipo = "Escaleno";
                            JOptionPane.showMessageDialog(null,"O triangulo é: "+ tipo + "\n A área do triangulo é: " + sp);
                        }else{
                            tipo = "Isóceles";
                            JOptionPane.showMessageDialog(null, "O triangulo é: "+ tipo +"\n A área do triangulo é: " + sp);
                        }
                    }         
                    break;
                case'2':
                    //caso ela seja de valor 2, ele finaliza o programa.
                    JOptionPane.showMessageDialog(null,"Programa Finalizado!");
                    System.exit(0); 
                    break;
                default: 
                    //caso ela seja qualquer outro valor diferente dos listados do Menu, ele printa um erro:
                    JOptionPane.showMessageDialog(null, "Esse comando não existe!");
            }
        }
        
    }
    
    public static void main(String[] args) {   menu();  } }

