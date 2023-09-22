public class OperadorUnario {
    public static void main(String[] args) {
        // Declarando variável
        int numero = 5;
        //imprimindo o valor negativo
        System.out.println(- numero);

        //Incrementando 1 unidade
        numero++;
        System.out.println(numero);

        //Decrementando 1 unidade
        numero--;
        System.out.println(numero);
        
        //Invertendo o valor da variavel lógica 
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);
    }
}
