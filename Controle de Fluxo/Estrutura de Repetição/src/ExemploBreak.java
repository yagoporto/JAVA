public class ExemploBreak {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            if(i == 3)
                break;
            
            System.out.println(i);
        }
        /* no console o numero irá até 2, pois ele já inicia em 1 e quando atinje
        o numero 3 a estrutura de decisão executa o comando break antes do
        comando println. */
    }
}
