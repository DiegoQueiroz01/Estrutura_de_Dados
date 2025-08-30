package Exercicios_Array;

public class Questao_02 {
    float[] numeros = new float[10];
    float[] invertidos = new float[numeros.length];

    public Questao_02(){
        numeros[0] = 1.0f;
        numeros[1] = 1.5f;
        numeros[2] = 2.0f;
        numeros[3] = 2.5f;
        numeros[4] = 3.0f;
        numeros[5] = 3.5f;
        numeros[6] = 4.0f;
        numeros[7] = 4.5f;
        numeros[8] = 5.0f;
        numeros[9] = 5.5f;
    }

    public void imprimirArray(){
        for(int i = 0; i < numeros.length; i++){
            invertidos[i] = numeros[numeros.length -1 - i];
        }
        for(float num : invertidos){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Questao_02 questao02 = new Questao_02();
        questao02.imprimirArray();
    }
}
