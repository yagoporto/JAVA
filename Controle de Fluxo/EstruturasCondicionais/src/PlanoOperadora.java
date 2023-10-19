import java.util.Scanner;
public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|                              PLANOS                                |");
        System.out.println("[B] BASICO: 100 minutos de ligação");
        System.out.print("[M] MIDIA: 100 minutos de ligação +");
        System.out.println("WhatsApp e Instagram");
        System.out.print("[T] TURBO: 100 minutos de ligação + WhatsApp");
        System.out.println("e Instagram + 5Gb Youtube");
        System.out.print("Escolha um plano: ");
        String plano = sc.nextLine();

        switch(plano){
            case "B":
                System.out.println("Parabés voce tem direito a 100 minutos de ligação");
                break;
            case "M":
                System.out.println("100 minutos de ligação + WhatsApp e Instagram ilimitados");
                break;
            case "T":
                System.out.println("100 minutos de  + WhatsApp e Istagram ilimitados + 5Gb no Youtube");
                break;
            default:
                System.out.println("Plano invalido");
            }
        }
}
