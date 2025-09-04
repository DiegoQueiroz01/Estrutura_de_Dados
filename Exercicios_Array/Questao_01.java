//1. Faça um programa em Java que leia um vetor de 5 números inteiros e mostre-os.
package Exercicios_Array;

import java.util.Scanner;
public class Questao_01 {
    int[][] numeros = new int[2][3];
    Scanner scan = new Scanner(System.in);

    public Questao_01(){

    /**numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;*/

    System.out.println("Insira 6 números inteiros: ");
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length; j++){
                numeros[i][j] = scan.nextInt();
            }
        }
        scan.close();
    }

    public void imprimirArray(){
        System.out.println("Números inseridos em formato matriz: ");
        for (int i = 0; i < numeros.length; i++){
            for(int j =0; j < numeros[0].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
        System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Questao_01 questao01 = new Questao_01();
        questao01.imprimirArray();
    }
}
