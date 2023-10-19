import java.util.Random;
import java.util.Scanner;
public class Telefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        boolean atendeu = false;

        System.out.println("Para quem voce quer ligar?");
        String nome = sc.nextLine();

        do{
            System.out.println("Discando para " + nome + "...");
            atendeu = rd.nextBoolean();
        }while(atendeu == true);

        System.out.println("Alô, tudo bem?");
    }
}
