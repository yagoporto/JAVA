# Terminal e Argumentos

Nem sempre executamos nosso programa Java pela IDE, já pensou nosso clientes tendo que instalar o Eclipse ou VsCode para rodar o sistema em sua empresa?

Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.

No nosso caso iremos aprender como executar um programa Java via terminal como MS - DOS ou terminal do VsCode.

```java
public class MinhaClasse{
 public static void main(String[] args){
    System.out.println("Oi, fui executado pelo terminal");
 }
}
```

<aside>
⚠️ Observe que após a execução do código dentro da IDE, gera um arquivo .class dentro da pasta /src, esse é nosso arquivo bytecode.

</aside>

![Untitled.png](Terminal%20e%20Argumentos%201d1dc2c5c1104a6e8eb80dd9dcc36a42/Untitled.png)

### Terminal

Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

1. Abra o CMD ou Power Shell.
2. Localize o diretório do seu projeto: cd C:\User\yagos\JAVA\JAVA\Terminal-Argumentos  **(no meu caso o diretório esta localizado ai)**
3. Acesse a pasta src: cd bin
4. Digite o comando: java ExecutarTerminal (use o nome da sua classe)

![Untitled](Terminal%20e%20Argumentos%201d1dc2c5c1104a6e8eb80dd9dcc36a42/Untitled%201.png)

---

### Argumentos

Quando executamos uma classe que contenha o método `main` o mesmo permite que passemos uma `array [ ]` de argumentos do tipo `String`. Logo podemos após a definição da classe a ser executada informar estes parâmetros, exemplo:

```java
java MinhaClasse argumentoUm argumentoDois
```

Exemplo:

```java
public class AboutMe{
 public static void main(String[] args){
   //Os argumentos começam com indice 0
   // String nome = args [0];
   String sobrenome = args [1];
   int idade = Integer.valueOf(args[2]);//vamos falar sobre Wrappers
   double altura = double.valueOf(args[3]);

   System.out.println("Ola, me chamo " + nome + " " + sobrenome);
      System.out.println("Tenho " + idade + " anos ");
      System.out.println("Minha altura é " + altura + "cm ");
 }
}
```

Passando valores pelo VsCode.

![Untitled](Terminal%20e%20Argumentos%201d1dc2c5c1104a6e8eb80dd9dcc36a42/Untitled%202.png)

![Untitled](Terminal%20e%20Argumentos%201d1dc2c5c1104a6e8eb80dd9dcc36a42/Untitled%203.png)

Para passar os paramentos pelo terminal executaremos o seguinte comando.

```java
// Entrar no diretorio que esta o programa
cd C:\Users\yagos\JAVA\JAVA\Terminal-Argumentos
cd src
//Executar o mesmo comando anterior porem passando os argumentos em seguida
java AboutMe Yago Porto 25 1.67
```

```java
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "request": "launch",
            "mainClass": "AboutMe",
            "args": ["GLEYSON", "SAMPAIO", "28", "1.58"]
        }
    ]
}
```

---

## Scanner

Nos exemplos anteriores percebemos que podemos receber dados digitados pelo usuário do nosso sistema, porém tudo precisa esta em uma linha e também é necessário informar os valores nas posições correspondentes. Esta abordagem pode deixa margens de execução com erro do nosso programa. Para isso, com a finalidade de deixar as nossas entradas de dados mais seguras agora vamos receber estes dados vias `Scanner` .

A classe **`Scanner`** permite que o usuário tenha uma interação mais assertiva com o nosso programa, veja como vamos mudar o nosso programa **`AboutMe`** para deixar mais intuitivo aos usuários.

```java
import java.util.Locale;
import java.ultil.Scanner;

public class AboutMe{
 public static void main (String[] args){
   //criando o objeto scanner
   Scanner scanner = New Scanner(System.in).useLocale(Locale.US);
   
   //Recebendo os valores e parametros do usuario via Scanner
   System.out.print("Digite seu nome: ");
   String nome = scanner.next();

   System.out.print("Digite seu sobrenome: ");
   String sobrenome = scanner.next();

   System.out.print("Digite sua idade: ");
   int idade = scanner.nextInt();
   
   System.out.print("Digite sua altura: ");
   double altura = scanner.nextDouble();

   //imprimindo os dados obtidos pelo usuario
      System.out.println("Ola, me chamo " + nome + " " + sobrenome);
      System.out.println("Tenho " + idade + " anos");
      System.out.println("Minha altura é " + altura + "cm");
 }
}
```

`import java.util.Locale;` : importa a classe `Locale` para os parâmetros ficarem na convenção dos Estados Unidos (ou de alguma outro pais)

`import java.util.Scanner;` : Importa a classe `Scanner` para que possamos receber dados do usuários de forma mais dinâmica.

`next` : a que essa variável que esta sendo preenchida vai retorno o determinado tipo, `next` retorna uma `String` .

`nextInt` : Retorna um valor inteiro e assim por diante.
