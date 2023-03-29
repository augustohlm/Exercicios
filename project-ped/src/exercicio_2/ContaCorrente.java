package exercicio_2;
	
public class ContaCorrente {
	private int numeroConta, agenciaConta;
	private double saldo;
	
	public double getNumero() {
		return(numeroConta);
	}
	public void setNumero (int numero) {
		numeroConta = numero;
	}
	public double getAgencia() {
		return(agenciaConta);
	}
	public void setAgencia (int agencia) {
		agenciaConta = agencia;
	}
	public double getSacar() {
		System.out.print(" ");
		return(saldo);
	}
	public void setSacar (double valor){
		if(saldo < valor) {
			System.out.print("Valor é maior do que o disponivel em conta!");} else {
			saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso, segue abaixo os dados finais: " );	
			System.out.println("Agencia: " + agenciaConta);
			System.out.println("Numero: " + numeroConta);
			System.out.print("Saldo: ");
			}
}
	public double getDepositar() {
		return(saldo);
	}
	public void setDepositar(double valor){
		saldo = saldo + valor;
	}
	public double consultarSaldo(){
		return(saldo);
	}
}
