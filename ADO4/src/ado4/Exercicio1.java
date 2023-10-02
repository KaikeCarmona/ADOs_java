package ado4;

import java.util.Scanner;

public class Exercicio1 {
 
    public static void main(String[] args) {
       int NumLados, MedLadosTriangulo, MedLadosQuadrado, MedLadosPentagono, somaLados = 0, primeiroDado = 0, segundoDado = 0, terceiroDado =0;
       double  areaTriangulo = 0, areaQuadrado, areaPentagono = 0 , perimetro, Apothem = 0 ;
        
       Scanner teclado = new Scanner(System.in);
       System.out.printf("Quantos lados tem essa forma geometrica: ");
       NumLados = teclado.nextInt(); 

        if(NumLados < 3){
            System.out.println("NAO E UM POLIGONO.");
        }
        if(NumLados == 3){
           for(int i = 0; i <= NumLados; i++){
                if (i == 0){
                    i = i+1;
                }
                System.out.printf("Digite a medida do "+ i +": ");
                MedLadosTriangulo = teclado.nextInt();
                if (NumLados == 3){
                    if(i == 1){
                        primeiroDado = MedLadosTriangulo;
                    }
                    if(i == 2){
                        segundoDado = MedLadosTriangulo;
                    }
                    if(i == 3){
                        terceiroDado = MedLadosTriangulo;
                    }
                    somaLados += MedLadosTriangulo;
                    perimetro = somaLados/2;
                    areaTriangulo = Math.sqrt(perimetro*(perimetro-primeiroDado)*(perimetro-segundoDado)*(perimetro - terceiroDado));
                }
            } 
            System.out.println(primeiroDado +" "+ segundoDado +" "+terceiroDado);
            System.out.println("------TRIANGULO------");
            System.out.println("o perimetro do triangulo e: " + areaTriangulo);
        }

        if(NumLados == 4){
            System.out.printf("Digite um lado do quadrado: ");
            MedLadosQuadrado = teclado.nextInt();
            areaQuadrado = Math.pow(MedLadosQuadrado, 2);
            System.out.println("------QUADRADO------");
            System.out.println("A area do quadrado e: " + areaQuadrado);
        }
        
        if(NumLados == 5){            
            System.out.println("------PENTAGONO------");
            System.out.printf("Digite um lado do pentagono: ");
            MedLadosPentagono = teclado.nextInt();
            System.out.printf("Digite o Apothem do pentagono: ");
            Apothem = teclado.nextDouble();
            areaPentagono = 2.5*MedLadosPentagono*Apothem;
            System.out.println("A area do pentagono e: " + areaPentagono);
        }
        
        if(NumLados > 5){
            System.out.println("POLIGONO NAO IDENTIFICADO.");
        }

    }
}
