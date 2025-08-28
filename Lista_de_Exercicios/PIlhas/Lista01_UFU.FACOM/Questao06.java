/*6. Escreva um algoritmo, usando uma Pilha, que inverte as letras de cada palavra de um texto terminado por ponto (.) preservando a ordem das palavras. 
Por exemplo, dado o texto:
ESTE EXERCÍCIO É MUITO FÁCIL.
A saı́da deve ser:
ETSE OICÍCREXE É OTIUM LICÁF
*/

package Lista_de_Exercicios.PIlhas.Lista01_UFU.FACOM;

public class Questao06 {
    public static String inverterPalavras(String texto){
        if (texto == null) return null;

        StringBuilder saida = new StringBuilder();
        int tamanho = texto.length();

        ArrayStack<Character> pilha = new ArrayStack<>(tamanho);

        for (int i = 0; i < tamanho; i++){
            char letra = texto.charAt(i);

        if (letra == '.') {
            while (!pilha.isEmpty()) {
                saida.append(pilha.pop());
            }
            break;
        } else if (Character.isWhitespace(letra)) {
            while (!pilha.isEmpty()) {
                saida.append(pilha.pop());
            }
            saida.append(letra);
        } else {
            pilha.push(letra);
        }
    }
    return saida.toString();
}
}
