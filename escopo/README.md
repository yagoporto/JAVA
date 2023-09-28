# Escopo

O escopo por ser entendido como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis **vai de acordo com o bloco onde ela foi declarada.**

A variável é criada no primeiro acesso á ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portando, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

Caso você declare uma variável DENTRO DE UM METÓDO, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.

Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão. Sem um domínio sobre o escopo de  códigos seu projeto tende a conter falhas estruturais e comprometer a proposta principal da aplicação.

```java
public class Conta{
	//variavel da classe conta
	double saldo = 10.0;

	public void sacar(Double valor){
			//variavel local de metodo
			double novoSaldo = saldo - valor;
	}
	public void imprimirSaldo(){
			//disponivel em toda a classe
			System.out.println(novoSaldo);
			//somente o método sacar conhece esta variavel
			System.ou.println(novoSaldo)
	}
	public double calcularDividaExponencial(){
			 //variavel local de metodo
			double valorParcela = 50.0;
			double valorMontante= 0.0; //começando va variável com valor zero
			for(int x=1; x <= 5; x++){//x variável de escopo de fluxo
					//esta variável será reiniciada a cada execução for
					double valor calculado = valorParcela * x;
					valorMontante = valorMontante + valorCalculado;
			}	
			//escopo de fluxo
			//x e valorCalculado nunca estarão disponíveis fora do for

			return valorMontante;	
	}
}
```