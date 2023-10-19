# Sintaxe de declaração de uma nova classe:

```java
public class Minha classe {

//seu código aqui

}
```

- 99,9% das nossas classes iniciarão com `public class;`
- Toda classe precisa de nome, exemplo `MinhaClasse;`
- O nome do arquivo deve ser idêntico ao nome da classe pública;
- Após o nome, definir o corpo `{ }` , onde iremos compor nossas classes com atributos e métodos.

Se a minha classe é executável (tem a capacidade de realizar a inicialização do projeto, ou de forma independente) essa precisa ter um [[método]](https://www.devmedia.com.br/metodos/7348#:~:text=Um%20método%20em%20Java%20é,definidos%20dentro%20de%20uma%20classe.) principal denominado `main`  

### Exemplo:

```java
//Classe principal
public class MinhaClasse {
		//classe executável 
    public static void main (String [] args) {
				//MÉTODO
        System.out.print ( "Hello World!");
    }
}
```

---

# Padrão de nomenclatura

- Arquivo.java: todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta a segunda palavra também deve ser maiúscula,

### Exemplo:

```java
Calculadora.java
CalculadoraCientifica.java
```

- Nome a classe no arquivo: A classe deve possuir o mesmo nome do arquivo .java

### Exemplo:

```java
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
```

- Nome de Variável: Toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA

### Exemplo:

```java
int ano
int anoFabricacao
//o nome dessa prática para nomear variáveis dessa forma se chama "camelcase"
```

- Existe uma regra adicional para a variável quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome br sempre representará “Brasil” e nunca mudará seu valor, logo determinado como escrita o código abaixo:

```java
string BR = "Brasil"
double PI = 3.14
int ESTADOS_BRASILEIRO = 27
int ANO_2000 = 2000
```

<aside>
⚠️ Recomendações: Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém devemos seguir algumas regras de linguagem.

</aside>

- Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9.
- Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número.
- Deve iniciar com uma letra minúscula (boa prática - ver abaixo).
- Não pode conter espaços.
- Não podemos usar palavras-chaves da linguagem.
- O nome deve ser único dentro de um escopo

```java
//declarações invalidas de uma variável

int numero&um = 1; // Os únicos símbolos permitidos são _ e $
int 1nunmero = 1; // Uma variável não pode começar com número
int numero um = 1; //Não pode ter espaço no nome da variável
int long = 1; //long faz parte das palavras reservadas da linguagem java

//declaração valida de variável

int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
```

---

# **Declarando variáveis e métodos**

Variáveis são espaços na memoria para que alguma informação seja injetada nela, seja números ou caracteres, métodos são blocos de códigos para executar um procedimento, também conhecido como funções em outras linguagens.

- Declaração de variáveis em Java segue sempre a seguinte estrutura:

```java
// Estrutura

Tipo NomeBemDefinido = atribuição (opcional em algumas casos)

// Exemplo:

int idade = 25;
double altura = 1.62;
dog spike; // oberseve que aqui a variável spike não tem valor.
```

- Declarando métodos em Java:

```java
//Estrutura
TipoRetorno NomeObjetivoNoInfinitivo Parametros

// Exemplo 
int  somar (int numeroUm, int numer2)

String formatarCep (long cep)

```

```java

//Exemplo de método completo em Java

public class Classes2 {
    public static void main (String [] args) {
				//Declarando Variáveis
        String primeiroNome = "Yago";
        String segundoNome = "Porto";
				//Declarando variável e chamando o método (função)
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
				
				//Exibindo na tela a o resultado do método
        System.out.println(nomeCompleto);

    }
		//Criando o método
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
```

---

# Identação

Termo utilizado para escrever códigos de forma hierárquica, organizando e facilitando a visualização e entendimento do programa.

![spaces_2qZwrhEqcOsERZF1L25d_uploads_git-blob-72b20a7c3db3d32c63ec3fd99883c9bd021e9e32_image (5) (1) (1) (1).webp](Java%20Developer%2068deb8c13a2a49548741d27dff333d6f/spaces_2qZwrhEqcOsERZF1L25d_uploads_git-blob-72b20a7c3db3d32c63ec3fd99883c9bd021e9e32_image_(5)_(1)_(1)_(1).webp)

### Exemplo:

Sem Identação

Com Identação 

```java
// arquivo BoletimEstudantil.java

public class BoletimEstudantil {
public static void main(String[] args) {
int mediaFinal = 6;
if(mediaFinal<6)	
System.out.println("REPROVADO"); 
else if(mediaFinal==6)
System.out.println("PROVA MINERVA"); 
else
System.out.println("APROVADO"); 		
}
}
```

```java
// arquivo BoletimEstudantil.java

public class BoletimEstudantil {
	public static void main(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}
```

---

# Organizando arquivos

A media que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages).

![spaces_2qZwrhEqcOsERZF1L25d_uploads_git-blob-0e8fc13c780314b11e9dde37119c40cfa8817b48_image (2).webp](Java%20Developer%2068deb8c13a2a49548741d27dff333d6f/spaces_2qZwrhEqcOsERZF1L25d_uploads_git-blob-0e8fc13c780314b11e9dde37119c40cfa8817b48_image_(2).webp)

```java
com = comercial
org = organização
com ou opensourc = opensourc

Nome da empresa:Yg informática
Tipo: Comerncial
Nome da aplicação: aniversarioWhatsapp

com.yginformatica.aniversariowhatsapp.app

```

---

# Java Beans

Uma das maiores dificuldade na programação é escrever algoritmos legíveis a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso a linguagem Java sugere, através de convenções, formas de escrita universal para nossa classe, atributos, métodos e pacotes.

### Variáveis

- Uma variável deve ser clara, sem abreviações ou definições sem sentido.
- Uma variável é sempre no singular, **exceto quando se referir a um array ou coleção.**
- Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

```java
// Não recomendado
double salMedio = 1500.23; // Variável abreviada, dificultando a compreenção
String emails = "aluno@escola.com"; //Dificil identificar se a variável seria um array ou único e-mail
String myName = "Jony"; // se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não
```

```java
// Recomendado
double salarioMedio = 1500.23;
String email = "aluno@escola.com";
String [] emails = {"aluno@escola.com", "professor@escola.com"};
String meuNome = "Jony";
```

### Métodos

- Deverão ser nomeados como verbos através de uma mistura de letras maiúsculas e minúsculas.
- Em princípio todas as letras que compõe o nome deve ser mantidas em minúsculo, exceto pela primeira letra de cada palavra composta a partir da segunda palavra.

 

```java
//Exemplos sugeridos para nomeclatura de métodos
somar(int n1, int n2){}
abrirConexao (){}
concluirProcessamento(){}
findById(int id){}

calcularImprimir(){} // Há algo de errado com esse método, ele devería ter uma única finalidade.

```