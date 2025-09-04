//4. Faça um programa em Java que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

package Exercicios_Array;

import java.util.Scanner;

public class Questao_04 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    char[] vetor = new char[10]; //criação do vetor de caractere.
    int contConsoantes = 0;
    String consoantes = "";

    System.out.println("Digite uma palavra: ");

    for(int i = 0; i < 10; i++){
        vetor[i] = scanner.next().charAt(0); //lê o vetor de caracteres.
        char c = Character.toLowerCase(vetor[i]);
        if(c >= 'a' && c<= 'z' && !"aeiou".contains(String.valueOf(c))){
            contConsoantes++;
            consoantes += c + " ";
        }
    }

    System.out.println("Quantidade de consoantes: " + contConsoantes);
    System.out.println("Consoantes: " + consoantes);
    scanner.close();
}
}
