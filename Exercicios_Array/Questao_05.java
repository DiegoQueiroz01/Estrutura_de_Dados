//5. Faça um programa em Java que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. 
//Imprima os três vetores.

package Exercicios_Array;

import java.util.Scanner;

public class Questao_05 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetor = new int[5];
    int[] PAR = new int[5];
    int[] IMPAR = new int[5];
    int contPAR = 0;
    int contIMPAR = 0;

    System.out.println("Digite 20 números inteiros: ");

    for(int i = 0; i < 5; i++){
        vetor[i] = scan.nextInt();
        if(vetor[i] % 2 == 0){
            PAR[contPAR] = vetor[i];
            contPAR++;
        } else{
            IMPAR[contIMPAR] = vetor[i];
            contIMPAR++;
        }
    }

    System.out.println("Vetro completo: ");

    for(int i = 0; i < 5; i++){
        System.out.println(vetor[i] +  "");
    }

    System.out.println("\nVetor PAR: ");
    for(int i = 0; i < contPAR; i++){
        System.out.println(PAR[i] + " ");
    }

    System.out.println("\nVetor IMPAR: ");
    for(int i = 0; i < contIMPAR; i++){
        System.out.println(IMPAR[i] + " ");
    }

    scan.close();
}
}
