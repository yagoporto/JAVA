public class Constantes {
    public static void main(String[] args) {
        //Declando variável e atribuindo o valor de 5 a ela
        int numero = 5;
        // Alterando o valor dessa variável
        numero = 10;

        System.out.print(numero);

        /*Declarando constante, usando a palavra reservada final
        para garantir que essa variável nunca tenha seu valor alterado*/
        final Double pi = 13.14;

        /*Essa linha vai dar erro de sintaxe pois a constante
        "pi" nao pode ser alterada*/
        pi = 10.30;
    }
}
