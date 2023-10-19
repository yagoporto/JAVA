import java.util.Random;

public class LigarEdilson{
    public static void main(String[] args) {
        Random rd = new Random();
        boolean atendeu = false;

        do{
            System.out.println("Discando para Edilson...");
            atendeu = rd.nextBoolean();
        }while(atendeu == true);

        System.out.println();
        System.out.println("Edilson: Pronto!!");
    }
}