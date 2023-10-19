# Estrutura de repetição

Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.

Laços ou repetições são representados pelas seguintes estruturas:

- **`For`** (para)
- **`While`** (enquanto)
- **`Do While`** (faça enquanto)

## For

O comando `for` (”para” na tradução literal para português) permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando `for` recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação.

Segue um exemplo da estrutura do comando `for` :

```java
//estrutura do controle de fluxo for

for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
```

Na pratica podemos imaginar a seguinte situação:

O seu amigo pediu para você criar um programa que contasse de 1 ate 20

```java
public class Contador {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            System.out.print(i + "..");
        }
    }
}
```

1. `int i = 1;`  → É criado uma variável dentro do comando `for` que inicia com o valor 1.
2. `i <= 20;` → O programa verifica se a variável ainda é menor ou igual a vinte, caso não a execução continua ate que atinja o valor.
3. O programa começa a executar o algoritmo, no nosso caso imprimir o valor de `i` em contagem, sempre que entra em um novo ciclo o valor de `i` aumenta em 1 até chegar a 20;
4. `i++` → Acrescenta + 1 na variável contadora (`i`).
5. O loop encerra quando a variável chega no valor de 20.

Segue mais um exemplo:

```java
public class Contador {
    public static void main(String[] args) {
				int i = 1;
        for(; i <= 20; i++){
            System.out.print(i + "..");
        }
    }
}
```

Aqui mostra que a variável não precisa necessariamente ser declarada dentro da sintaxe do comando `for` , mais o uso dela dentro do comando ajuda a manter a organização e evita o excesso de variável no escopo global.

<aside>
⚠️ Vale lembrar que a condição e o incremento do contador é de importância para que o comando funcione de forma correta e atinja o objetivo desejado e não entre em loop infinito.

</aside>

## For Each

O uso do `for / each` está fortemente relacionado com um cenário onde contenha um array ou coleção e assim, a interação é baseada aos elementos da coleção.

```java
public class ForEach {
    public static void main(String[] args) {
        String membros[] = {"Yago", "Rhian", "Luan",
        "Breno", "Jonatas", "Rick"};

        //Forma abreviada
        for(String membro : membros){
            System.out.println(membro);
        }
    }
}
```

1.   `String membro : membros` -> De forma abreviada é criada uma variável `membro` obtendo um elemento do vetor a cada ocorrência.
2. A impressão de cada membro é realizada.

## Break e continue]

**Break** significa quebrar, parar, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente. **Continue**, como o nome diz, ele 'continua' o laço. O comando **`break`** interrompe o laço, já o **`continue`** interrompe somente a iteração atual.

```java
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
```

```java
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
```

## While

O laço **`while`** (na tradução literal para a língua portuguesa “enquanto”) determina que enquanto uma condição for válida, o bloco de código será executado. O laço **`while`** testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

A estrutura de sintaxe do controle de repetição **`while`** é exibida abaixo:

```java
//estrutura do controle de fluxo while

while (expressão booleana de validação)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
```

Temos a seguinte situação:

Crie um programa onde o usuário digite um numero aleatório do tipo inteiro entre 1 e 100 e a maquina tem advinha o valor digitado.

```java
import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palpite = 0;

        System.out.print("Digite um numero entre 1 e 100: ");
        int resposta = sc.nextInt();

        System.out.println("Deixa eu pensar...");

        while(palpite != resposta){
            palpite++;
        }

        System.out.println("Já sei o numero que você escolheu é: " + palpite);
    }
    
}
```

## Do While

O laço **`do / while`** (na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while, considera que enquanto uma determinada condição for válida o bloco de código será executado. Entretanto, **`do / while`** testa a condição após executar o código,sendo assim, mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado pelo menos uma vez.

A estrutura de sintaxe do controle de repetição **`do / while`** é exibida abaixo:

```java
//estrutura do controle de fluxo do while

do
{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
while (expressão booleana de validação);
```

Temos a seguinte situação:

Crie um programa que peça ao usuário o nome para quem ele quer ligar  e enquanto a  ligação esta sendo efetuada e o aparece a mensagem “Discando (nome do contato)…” enquanto a ligação não for atendida.

```java
import java.util.Random;
import java.util.Scanner;
public class Telefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        boolean atendeu = false;

        System.out.println("Para quem voce quer ligar?");
        String nome = sc.nextLine();

        do{
            System.out.println("Discando para " + nome + "...");
            atendeu = rd.nextBoolean();
        }while(atendeu == true);

        System.out.println("Alô, tudo bem?");
    }
}
```

---