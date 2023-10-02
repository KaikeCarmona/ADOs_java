package ado4;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        int ladoA,ladoB,ladoC ;

        Scanner teclado = new Scanner(System.in);

        System.out.println("-------Verificacao de TRIANGULO-------");
        
        System.out.printf("Qual o tamanho do primeiro lado: ");
        ladoA = teclado.nextInt();
        
        System.out.printf("Qual o tamanho do segundo lado: ");
        ladoB = teclado.nextInt();
        
        System.out.printf("Qual o tamanho do terceiro lado: ");
        ladoC = teclado.nextInt();
        
        if( ladoA >= (ladoB + ladoC) || ladoB >=(ladoA+ladoC) || ladoC >= (ladoB+ladoA) ){
        System.out.println("Essa forma nao e um TRIANGULO!!!");
        }else if(ladoA == ladoB && ladoB==ladoC){
            System.out.println("E um triangulo EQUILATERO!!!");
        }else if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA){
            System.out.println("E um triangulo ISOCELES!!!");
        }else if(ladoA != ladoB && ladoB != ladoC && ladoC != ladoA){
            System.out.println("E um triangulo ESCALENO!!!");
        }
    }
}
