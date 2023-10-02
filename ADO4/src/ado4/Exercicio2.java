package ado4;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
       
        int n1, n2, n3, maior = 0, medio = 0, menor = 0;
        
        Scanner teclado= new Scanner(System.in); 
        
        
        n1 = teclado.nextInt();
        System.out.printf("Digite o segundo numero: ");
        n2 = teclado.nextInt();
        System.out.printf("Digite o terceiro numero: ");
        n3 = teclado.nextInt();
        
        if(n1 > n2 && n1>n3){
            maior = n1;
        }else if( n1 > n2 && n1<n3){
            medio = n1;
        }else if( n1 < n2 && n1<n3){
            menor = n1;
        }
        
        if(n2 > n1 && n2>n3){
            maior = n2;
        }else if( n2 > n1 && n1<n3){
            medio = n2;
        }else if( n2 < n1 && n1<n3){
            menor = n2;
        }
               
        if(n3 > n1 && n3>n2){
            maior = n3;
        }else if( n3 > n2 && n1<n3){
            medio = n3;
        }else if( n3 < n2 && n1<n3){
            menor = n3;
        }
        
        System.out.println("O menor numero é: " + menor);
        System.out.println("O numero do meio é é: " + medio);
        System.out.println("O maior numero é: " + maior);

    }
}
