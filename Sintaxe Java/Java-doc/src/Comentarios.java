public class Comentarios {

    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha


        /* Olá,
        * Eu sou um comentario
        * que posso ser mais detalhadod
        * quando necessário
        */


        
         /** 
        * Estas duas estrelinhas acima
        * é para identificar que você
        * pretende elaborar um comentário
        * a nível de documentação.
        * Que incrível !!!
        */
        public void metodo(){
       
        }
       
        }
         /* Um comentário não possui a finalidade 
         de amenizar um algoritmo não estruturado 
         conforme as convenções da linguagem.
        Ex:

        * Este método foi elaborado as pressas
        * por isso eu abrevei o nome das variáveis
        * mas olha, ele tem a finalidade somar ou  multiplicar
        * dois números
        */
        public int somaMultiplica (int n, int x, String m){
            int r = 0; // r é igual ao resultado
            if (m == "M"){ // M= multiplicação
                r= n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;
            }
}
