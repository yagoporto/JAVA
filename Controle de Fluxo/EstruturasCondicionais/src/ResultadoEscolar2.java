public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else if(nota >= 6 && nota < 7){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }

    }
}
