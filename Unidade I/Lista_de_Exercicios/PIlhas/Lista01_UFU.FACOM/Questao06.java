/*6. Escreva um algoritmo, usando uma Pilha, que inverte as letras de cada palavra de um texto terminado por ponto (.) preservando a ordem das palavras. 
Por exemplo, dado o texto:
ESTE EXERCÍCIO É MUITO FÁCIL.
A saı́da deve ser:
ETSE OICÍCREXE É OTIUM LICÁF
*/


public class Questao06 {
    public static String inverterPalavras(String texto){
        if (texto == null) return null;

        StringBuilder saida = new StringBuilder();
        int tamanho = texto.length();

        java.util.Stack<Character> pilha = new java.util.Stack<>();

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
