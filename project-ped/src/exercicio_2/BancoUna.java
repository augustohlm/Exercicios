package exercicio_2;
import java.util.Scanner;
public class BancoUna {

	public static void main(String[] args) {
		// mc se refere a "minha conta"
		ContaCorrente mc = new ContaCorrente();
		Scanner sc = new Scanner(System.in);
		// Instanciei o SC para gerar um input dentro do set e utiliza-lo com o SET e Get.
		System.out.println("Informe o numero e agencia da conta: ");
		System.out.print("Numero : ");
		mc.setNumero(sc.nextInt());
		System.out.print("Agencia : ");
		mc.setAgencia(sc.nextInt());
		
		System.out.print("Informe um valor para deposito: ");
		mc.setDepositar(sc.nextDouble());
		System.out.print("Informe um valor para Sacar: ");
		mc.setSacar(sc.nextDouble());
		//optei por inserir as informações finais dentro do getSacar, ja que o codigo será finalizado 
		//quando o parametro for chamado conforme abaixo.
		System.out.print(mc.getSacar());
		
		sc.close();
	} 
	
} 
