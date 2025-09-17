/* 5. Considere uma pilha que armazene caracteres. Faça uma função para determinar se, uma string é da forma XY, onde X é uma cadeia formada por caracteres 
arbitrários e Y é o reverso de X. Por exemplo, se x = ABCD, então y = DCBA. Considere que x e y são duas strings distintas. */

public class Questao05<T> {
    
    public static boolean ehFormatoXY(String letra){
        if (letra == null) return false;

        int tamanho = letra.length();
        if (tamanho == 0) return false;
        if (tamanho % 2 != 0) return false;

    int meio = tamanho / 2;

    java.util.Stack<Character> pilha = new java.util.Stack<>();

    for (int i = 0; i < meio; i++){
        pilha.push(letra.charAt(i));
    }

    for(int i = meio; i < tamanho; i ++){
        char top = pilha.pop();
        if (top != letra.charAt(i)){
            return false;
        }
    }
    return true;
    }

    public static void main(String[] args) {
        String[] casos = {
            "ABCDDCBA",
            "ABBA",
            "AABB",
            "ABA",
            "",
            "AA"
        };

        for (String letra : casos){
            System.out.println("letra: " + letra + " formato: " + ehFormatoXY(letra) + " tamanho: " + letra.length());
        }
    }
}