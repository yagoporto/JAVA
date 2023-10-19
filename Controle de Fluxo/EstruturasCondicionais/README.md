# Estruturas condicionais

A Estrutura Condicional possibilita a escolha de um grupo de ações e comportamentos a serem executadas quando determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser **Simples** ou **Composta**.

## Condicionais Simples

Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, consideramos como uma estrutura **Simples**, exemplo:

```java
public class CaixaEletronico{
		public static void main (String [] args){
				
				double saldo = 25.0;
				double valorSolicitado = 13.0;

				if(valorSolicitado < saldo)
					saldo = saldo - valorSolicitado;
					
					System.out.println(saldo);	
		}
}
```

## Condicionais Composta

Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução condicionado a uma regra de negócio, este cenário é denominado **Estrutura Condicional Composta**. Vejamos o exemplo abaixo:

```java
public class ResultadoEscolar{
		public static void main (String [] args){
					int nota = 6;
					
					if(nota >=7){
							System.out.println("Aprovado!");	
					}
					else{
						System.out.println("Reprovado!");	
					}
						
		}
}
```

## Condicionais encadeadas

Em um controle de fluxo condicional, nem sempre nos limitamos ao **se** (`if`) e **senão** (`else`), poderemos ter uma terceira, quarta e ou inúmeras condições.

```java
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
```

## Condição Ternaria

Como vimos em operadores, podemos abreviar nosso algorítmico condicional refatorando com o conceito de operador ternário. Vamos refatorar os exemplos acima para ilustrar o poder deste recurso:

```java
public class CondicaoTernaria1 {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >+7 ? "Aprovado!" : "Reprovado!";
        System.out.println(resultado);
    }
}
```

```java
public class CondicaoTernaria2 {
    public static void main(String[] args) {
        int nota =6;
        String resultado = nota >=7 ? "Aprovado!" : nota >= 5 && nota <7 ? "Recuperação!" : "Reprovado!";
        System.out.println(resultado);
    }
}
```

## Switch Case

A estrutura **switch** compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado, acrescentamos o comando ***break*** no final de cada bloco de códigos. O comando **break**, quando executado, encerra a execução da estrutura onde ele se encontra.

Vamos imaginar que precisaremos imprimir uma medida com base em mapa de valores, exemplo:

| Sigla | Tamanho |
| --- | --- |
| P | Pequeno |
| M | Médio |
| G | Grande |

```java
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
```

<aside>
⚠️ Observe que a nível de sintaxe não tivemos nenhum ganho quanto a redução de códigos e ainda tivemos mais uma preocupação em informar a palavra `break` em cada alternativa.

</aside>

Porém um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algorítimo seria conforme ilustração abaixo:

Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

- O sistema terá 03 planos: BASIC, MIDIA , TURBO
- BASIC: 100 minutos de ligação
- MIDIA: 100 minutos de ligação + WhatsApp e Instagram grátis
- TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5Gb Youtube

```java
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
```