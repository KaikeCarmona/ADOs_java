package javaapplication1;


public class Exercicio4 {

    public static void main(String[] args) {
        
        double p1 = 100;
        double p2 = 200;
        
        System.out.println(percentual(p1, p2));
        
    }

    
    public static double percentual( double pAntigo, double pNovo){
        
        double acresimo = ((pNovo - pAntigo)/100)*(pNovo - pAntigo);
        
        return  acresimo;
    }
    
    
}
