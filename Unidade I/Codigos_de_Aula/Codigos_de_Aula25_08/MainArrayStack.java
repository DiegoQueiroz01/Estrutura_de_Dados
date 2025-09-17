package Codigos_de_Aula.Codigos_de_Aula25_08;

//criar uma classe que estancia a pilha e testa seus métodos
public class MainArrayStack {
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack(5);

        stack.push("Instituto");
        stack.push("Federal");
        String temp = (String) stack.peek();
        System.out.println(temp);
        stack.push("da");
        stack.push("Bahia");

        String state = (String) stack.pop();
        System.out.println(stack);
        stack.push("Ceará");
        System.out.println(stack.toString());
    }
}
