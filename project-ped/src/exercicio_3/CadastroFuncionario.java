package exercicio_3;
import java.util.Scanner;

public class CadastroFuncionario {

	public static void main(String[] args) {
		
		Funcionario fc = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		// obs importante: foi necessário informar o Nome, Cargo e Endereco primeiro
		//pois ao fazer de acordo com a ordem do exercicio, eu enfrentei um problema com
		//a funcao next.Line(), pois ao inserir o nome e logo após a idadade, ele pulava 1 out.print
		//Assim pulando da idade para o salario, coloquei o metodo exibir conforme exercicio
		//somente o inputar que foi nessa ordem.
		
		System.out.print("Informe o seu nome: ");
		fc.setNome(sc.nextLine());
		System.out.print("Informe o seu cargo na empresa: ");
		fc.setCargo(sc.nextLine());
		System.out.print("Informe o seu endereço (Exemplo: Av joao cesar 155 Eldorado contagem): ");
		fc.setEndereco(sc.nextLine());
		System.out.print("Informe sua idade: ");
		fc.setIdade(sc.nextInt());
		System.out.print("Informe o seu salário: ");
		fc.setSalario(sc.nextDouble());
		
		
		
		fc.DadosFuncionario();
		
	sc.close();	
	}

}
