public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1=true, condicao2=false;


        //E
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }


        //OU
        if(condicao1 || condicao2){
            System.out.println("Uma das condições verdadeiras");
        }

        //Pode ser usado outras expressões como por exemplo:
        if(condicao1 && (8 < 10)){
            System.out.println("As duas condições são verdadeiras");
        }
    }   
}
