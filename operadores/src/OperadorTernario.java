public class OperadorTernario {
    public static void main(String[] args) {
        int a=6, b=6;
        String resultado="";

        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
	        resultado = "Verdadeiro";
        else
	        resultado = "Falso";

        System.out.println(resultado);
        
        //EXEMPLO DE CONDICIONAL COM OPERADOR TERNÁRIO
        String resultadoTernario = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultadoTernario);
    }
}
