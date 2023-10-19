public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1, numero2 = 2;
        
        boolean simNao = numero1 == numero2;
        System.out.println("Número 1 é igual a número 2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Número 1 é diferente do número 2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Número 1 é maior que número 2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("Número 1 é menor que número 2? " + simNao);

        // Também podemos comparar strings, classes, obejetos.
        String nome1 = "Steve", nome2 = "Steve";
        System.out.println(nome1 == nome2);

    }
}
