# Métodos

Todas as ações das aplicações são consideradas métodos.

---

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por usa vez, correspondem a **funções**  ou **sub-rotinas** disponíveis dentro de nossas classes.

### Critério de nomeação de Métodos

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa, Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

- Deve ser nomeado como verbo
- Seguir o padrão [[camelCase]](https://coodesh.com/blog/dicionario/o-que-e-camelcase/#:~:text=Você%20já%20ouviu%20falar%20em,com%20exceção%20do%20primeiro%20termo.) (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra.

Exemplos Sugeridos para nomenclatura de métodos:

 

```java
somar(int n1, int n2){}

abrirConexao(){}

findById(int id){} 

calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
```

<aside>
⚠️ ATENÇÃO! Não existe em **Java** o conceito de **métodos** globais. Todos os **métodos** devem SEMPRE ser definidos dentro de uma classe.

</aside>

---

### Critérios de definição de métodos

Para sabermos a melhor forma de definir métodos das  nossas classes, seguimos uma convenção estrutural para todos os métodos, determinada pelos aspectos abaixo:

 

1. **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável por retornar algum valor ou não
2. **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável por retornar algum valor ou não.
3. **Quais os parâmetros serão necessários para execução do método?** Os métodos as vezes precisam de argumentos como critérios para a execução.
4. **O método possui o risco de apresentar alguma exceção?** Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
5. **Qual a visibilidade do método?** Será necessário que o método seja visível a toda aplicação, somente em mesmo pacotes, através de herança ou somente a nível a própria classe.

<aside>
⚠️ Caso o método não retorne nenhum valor, ele será representado pela palavra-chave `void`

</aside>

Abaixo temos um exemplo de uma classe com dois métodos e suas respectivas considerações:

```java
public class MyClass{

	public double somar(int num1, int num2)
			 //LOGICA - FINALIDADE DO MÉTODO
				return ...;
}

	public void imprimir (String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN POIS NÃO SERÁ RETORNADO NENHUM RESULTADO		
	}
	
	// throws Exception : indica que o método ao ser utilizado,poderá gerar uma exceção
	public double dividir (int dividendo, int divisor) throws Exception{}
	
	// este método não pode ser visto por outras classes no projeto
	private void metodoPrivado(){}

	//alguns equívocos estruturais
	public void validar(){
				// este método deveria retornar algum valor no caso boolean (True ou False)
	}

	public void calcularEnviar(){
				//um método deve representar uma única responsabilidade 
	}

	public void gravarCliente(String nome, String cpf, Integer telefone, ...){
				//este método tem a finalidade de gravar informações de um cliente, por que não   criar um objeto cliente e passar como parâmetro ? veja abaixo
	}

	public void gravarCliente(Cliente cliente){}
	// ou
	public void gravar(Cliente cliente){}
```

---

## Exercitando

Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

1. Ela tenha as características: ligada (boolean), canal (int) e volume (int)
2.  Nossa TV poderá ligar e desligar e assim mudar o estado ligada
3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
4.  Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

OBJETO

```java
public class SmartTv {
    //definindo variáveis
    boolean ligada = false;
    int canal = 1, volume = 50;

    //Metodo para ligar
    public void ligar(){
        ligada = true;
    }
    //Metodo para desligar
    public void desligar(){
        ligada = false;
    }
    //Metodo para aumentar volume
    public void aumentarVolume(){
        volume++;
    }
    //Metodo para dimuir volume
    public void diminuirVolume(){
        volume--;
    }
    //Metodo para mudar canal para cima
    public void mudarCanalCima(){
        canal++;
    }
    //Metodo para mudar canal para baixo
    public void mudarCanalBaixo(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
```

INTERAÇÃO DO USUARIO (METODO MAIN)

```java
public class Usuario {
    public static void main(String[] args) throws Exception {
        //Criando o objeto na função main
        SmartTv smartTv = new SmartTv();

        //Estado inicial da tv
        System.out.println("TV: " +smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " +smartTv.volume);
        System.out.println();

        //Chamndo o "ligar" Metodos do objeto
        smartTv.ligar();
        //Novo estado da tv
        System.out.println("TV: " +smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " +smartTv.volume);
        System.out.println();

        //Chamando os metodos de volume e canal do objeto
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanalCima();
        smartTv.mudarCanalCima();
        smartTv.mudarCanalCima();
        //Novo estado da tv
        System.out.println("TV: " +smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " +smartTv.volume);
        System.out.println();

        //Chamando o metodo mudarCanal, onde o usuario escolhe o canal desejado
        smartTv.mudarCanal(13);
        //Novo estado da tv
        System.out.println("TV: " +smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " +smartTv.volume);
        System.out.println();
    }
    
}
```

---