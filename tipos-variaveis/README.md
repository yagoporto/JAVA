# Tipos e Variáveis

---

# Tipos de dados.

Nas programação existem algumas palavras reservadas para a representação dos tipos básicos de dados, que precisam ser manipulados para a construção de programas. Esses tipos sao conhecidos como [[TIPOS PRIMITIVOS]](https://dicasdeprogramacao.com.br/tipos-de-dados-primitivos/).

<aside>
<img src="https://www.notion.so/icons/exclamation-mark_purple.svg" alt="https://www.notion.so/icons/exclamation-mark_purple.svg" width="40px" /> Os oito tipos primitivos em Java são:
int, byte, short, long, float, double, boolean e char – esses tipos não são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)

</aside>

### Tipos primitivos e seus valores (capacidades).

| Tipo | Memória  | Valor Mínimo | Valor Máximo |
| --- | --- | --- | --- |
| byte | 1 byte | -128 | 127 |
| short | 2 bytes | -32.768 | 32.767 |
| int | 4 bytes | -2.147.483.648 | 2.147.483.647 |
| long | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |

### Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos:

| Tipo | Memória  | Valor Mínimo | Valor Máximo | Precisão |
| --- | --- | --- | --- | --- |
| float | 4 bytes | -3,4028E + 38 | 3,4028E + 38 | 6 – 7 dígitos |
| double | 8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos |

Apesar de o tipo **float** ocupar metade da memória consumida do que um tipo double, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

Atualmente, com os computadores modernos, se tornou desnecessário utilizar os tipos `short` e `byte`, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.

Da mesma forma, dificilmente utilizaremos o tipo `long`, pois não é tão comum trabalharmos com valores tão grandes.

Portanto, para representar números, na grande maioria das vezes utilizaremos o tipo `int` para representar números inteiros ou `double` para representar números fracionados.

<aside>
⚠️ os tipos char e boolean não entrou na lista por serem tipos que armazenam  dados de caracteres e lógicos (VERDADEIRO OU FALSO), respectivamente.

</aside>

---

# Declaração de variáveis

Variáveis é uma identificação de um espaço na memória pelo nosso programa. Seguindo as convenções em linguagem de programação , toda variável é composta por: tipo de dados + identificação + valor atribuído.

Estrutura padrão para declarar variável:

```java
// <Tipo> <Nome da Variavel> <atribuilçao de valor (Opcional)>
//Exemplo:

int idade; //Tipo "int", nome "idade", não foi atribuido valor
int anoFabricação = 2021; // tipo "int", nome "anoFabricação", valor atribuido "2021"
double salrioBruto = 2500; //tipo "double", nome "salarioBruto", valor atribuido "2.500"
```

Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:

```java
public class TipoDados {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
	

```

Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia podem estimular uma alteração de tipos de dados convencional.

---

### Variáveis e Constantes

Uma **variável** é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. **Java** é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

Já as constantes são valores armazenados na memoria que não podem ser modificados depois de declarados, em Java esses valores são representados pela palavra reservada `final`, seguida do tipo.

Por convenção toda variável constante deverá esta em CAIXA ALTA.

Exemplo:

```java
public class Constante{
	public static void main (String [] args){

		/* Ao usar  a palavra reservada "final", você determina que jamais essa variável poderá obeter outro valor
		que jamais essa variável poderá obeter outro valor */ 
		final double VALOR_DE_PI = 3.14;

	}
}
```

<aside>
⚠️ Compreendemos que para declarar uma variável como uma constante, utilizamos a palavra `final`, mas por convenção, esta variável deverá ser escrita toda em caixa alta.

</aside>