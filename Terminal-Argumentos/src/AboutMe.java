import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //Criando o obejeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Recebendo do usuario os valores e argumentos
        System.out.print("Digite sue nome: ");
        String nome = scanner.next();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade +" anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
