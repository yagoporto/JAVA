import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palpite = 0;

        System.out.print("Digite um numero entre 1 e 100: ");
        int resposta = sc.nextInt();

        System.out.println("Deixa eu pensar...");

        while(palpite != resposta){
            palpite++;
        }

        System.out.println("Já sei o numero que você escolheu é: " + palpite);
    }
    
}
