public class ExemploContinue {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            if(i == 3)
                continue;
        
        System.out.println(i);
        }
        /* no console os numeros que irão aparecer são 1, 2, 4, 5, pois assim
        que o contador atinge o numero 3 a estruta de decisão interrompe o print
        somente nessa etapa da execução*/
    }
}
