# Operadores



Símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações.

## Classificação dos operadores



### Atribuição

Representado pelo símbolo de igualdade `=` .

O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável, como já vimos anteriormente.  

---

### Operadores aritméticos

São operadores utilizado para realizar operações matemáticas entre valores numéricos.

| Operador  | Função |
| --- | --- |
| + | Soma |
| - | Subtração |
| * | Multiplicação |
| / | Divisão |
| % | Resto da divisão(modulo  |

Exemplo:

```java

double soma = 10 + 10;
int subtração = 120 - 40;
int multiplicacao = 10 * 30;
float divisao = 15 / 3;
int modulo = 18 % 3;

/*
	lembrando que os operadores seguem a ordem de [[precedência matemática]](https://www.matematica.pt/faq/operacoes-matematicas.php).
*/
double resultado = (10*7) + (20/4);
```

<aside>
⚠️ ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”

</aside>

Exemplo:

```java
String nomeCompleto = "LINGUAGEM" + "JAVA";
		
//qual o resultado das expressoes abaixo?
String concatenacao ="?"; 

concatenacao = 1+1+1+"1";

concatenacao = 1+"1"+1+1;

concatenacao = 1+"1"+1+"1";

concatenacao = "1"+1+1+1;

concatenacao = "1"+(1+1+1);
```

---

### Unários

Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

| Operador | Função |
| --- | --- |
| + | Positivo |
| -  | Negativo |
| ++ | Incremento |
| -- | Decremento |
| ! | Negação |
- (+) Operador unário de valor positivo: Números são positivos sem esse operador explicitamente.
- (-) Operador unário de valor negativo: Nega um número ou expressão aritmética.
- (++) Operador unário de incremento de valor: Incrementa o valor em 1 unidade.
- (--) Operador unário de decremento de valor: Decrementa o valor em 1 unidade.
- (!) Operador unário lógico de negação: Nega o valor de um expressão booleana.

Exemplo:

```java
//classe Operadores.java
int numero = 5;
		
//Imprimindo o numero negativo
System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
numero ++;
System.out.println(numero);

//ordem de precedencia conta aqui
System.out.println(++ numero);

boolean verdadeiro = true;

System.out.println("Inverteu " + !verdadeiro);
```

---

### Ternário

O [[Operador de Condição Ternário]](https://www.mballem.com/post/java-operador-ternario/) é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária como se fosse uma condição `if` normal, porém, de uma forma em que todo a sua estrutura estará escrita em uma única linha.

O operador ternário é representado pelos símbolos `? :` utilizados na seguinte estrutura de sintaxe:

```java
<Espressção condicional> ? <Caso condição seja true>:
<Caso condição seja false>
```

Exemplo:

```java
int a=6, b=6;
String resultado = a==b ? "Verdadeiro" : "Falso";

```

<aside>
⚠️ O Operador Ternário não se limita apenas a `String` .

</aside>

---

### Relacionais

Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando uma valor booleano como resultado.

| Operador | Função |
| --- | --- |
| == | Igual |
| != | Diferente |
| < | Menor  |
| > | Maior |
| <= | Menor igual |
| >= | Maior igual |
- `==` Quando desejamos verificar se uma variável é **IGUAL** a outra.
- `!=` Quando desejamos verificar se uma variável é **DIFERENTE** da outra.
- `>` Quando desejamos verificar se uma variável é **MAIOR QUE** a outra.
- `>=` Quando desejamos verificar se uma variável é **MAIOR OU IGUAL** a outra.
- `<` Quando desejamos verificar se uma variável é **MENOR QUE** outra.
- `<=` Quando desejamos verificar se uma variável é **MENOR OU IGUAL** a outra.

Exemplo:

```java
int numero1 = 1, numero2 = 2;

//variável do tipo lógico (TRUE ou FALSE)        
boolean simNao = numero1 == numero2;
System.out.println("Número 1 é igual a número 2? " + simNao); // false

simNao = numero1 != numero2;
System.out.println("Número 1 é diferente do número 2? " + simNao); //true

simNao = numero1 > numero2;
System.out.println("Número 1 é maior que número 2? " + simNao); // false

simNao = numero1 < numero2;
System.out.println("Número 1 é menor que número 2? " + simNao); //true
```

**Comparações avançadas**

Quando se refere a comparação de conteúdos na linguagem, devemos ter um certo domínio de como o Java trata o armazenamento deste valores na memória.

<aside>
⚠️ Quando estiver mais familiarizado com linguagem, recomendamos se aprofundar no conceito de espaço em memória **Stack** versus **Heap**.

</aside>

Vamos a alguns exemplos para ilustrar:

**Valor e referência**: Precisamos entender que em Java tudo é objeto, logo objetos diferentes podem ter as mesmas características, mas lembrando, ***são objetos diferentes***.

```java
// ComparacaoAvancada.java

public static void main(String[] args) {

String nome1 = "JAVA";

String nome2 = "JAVA";

System.out.println(nome1 == nome2); //true

String nome3 = new String("JAVA");

System.out.println(nome1 == nome3); //false

String nome4 = nome3;

System.out.println(nome3 == nome4); //true

//equals na parada

System.out.println(nome1.equals(nome2)); //??

System.out.println(nome2.equals(nome3)); //??

System.out.println(nome3.equals(nome4)); //??

}
```

**== versus equals:** Existe uma relevância forte em realizar comparações com **==** e **equals** na qual precisamos ter uma compreensão de quais as regras seguidas pela linguagem **** , exemplo:

```java
// ComparacaoAvancada.java

public static void main(String[] args) {

int numero1 = 130;

int numero2 = 130;

System.out.println(numero1 == numero2); //true

Integer numero1 = 130;

Integer numero2 = 130;

System.out.println(numero1 == numero2); //false

// A razão pela qual o resultado é false, é devido o Java tratar os valores

// Como objetos a partir de agora.

// Qual a solução ?

// Quando queremos comparar objetos, usamos o método equals

System.out.println(numero1.equals(numero2));

}
```

---

### Lógicos

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.

`&&` Operador Lógico "E"

`||` Operador Lógico "OU"

```java
boolean condicao1=true, condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");
```

**Expressões lógicas avançadas**

Nós acabamos de aprender que existem os operadores lógicos **`&`** (E) e `||` (OU), mas por quê no exemplo acima, foram ilustradas as condições:

`if (condicao1 **&&** condicao2)` e `if(condicao1 **||** condicao2)` ?

<aside>
⚠️ A duplicidade nos operadores lógicos é um recurso conhecido como [[***Operador Abreviado]***](https://www.devmedia.com.br/operadores-logicos-e-metodos-final/8321), isso quer que se a condição1 atender aos critérios não será necessário validar a condição2.

</aside>

---