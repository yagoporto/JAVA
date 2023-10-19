import java.util.Scanner;
public class SistemaMedidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual letra esta na sua etiqueta? ");
        String sigla = sc.nextLine();

        switch(sigla){
            case "P":
                System.out.println("Sua roupa é tamanho PEQUENO");
                break;
            case "M":
                System.out.println("Sua roupa é tamanho MÉDIO");
                break;
            case "G":
                System.out.println("Sua roupa é tamanho GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
                break;
        }
    }
}