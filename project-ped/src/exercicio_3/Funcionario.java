package exercicio_3;

public class Funcionario {
	
	private String NomeF, CargoF, EnderecoF;
	private int IdadeF;
	private double SalarioF;
	
	public String getNome () {
		return this.NomeF;
	}
	public void setNome(String Nome) {
		this.NomeF = Nome;
	}
	public String getCargo() {
		return this.CargoF;
	}
	public void setCargo(String Cargo) {
		this.CargoF = Cargo;
	}
	public String getEndereco() {
		return this.EnderecoF;
	}
	public void setEndereco(String Endereco) {
		this.EnderecoF = Endereco;
	}
	public int getIdade() {
		return this.IdadeF;
	}
	public void setIdade(int Idade) {
		this.IdadeF = Idade;
	}
	public double getSalario() {
		return this.SalarioF;
	}
	public void setSalario(double Salario) {
		this.SalarioF = Salario;
	}
	public void DadosFuncionario() {
		System.out.println("---------------------------");
		System.out.println("   DADOS DO FUNCIONARIO    ");
		System.out.println("---------------------------");
		System.out.println(" Nome: " + NomeF);         
		System.out.println(" Idade: " + IdadeF);
		System.out.println(" Cargo: " + CargoF);
		System.out.format(" Salário: R$ %.2f", SalarioF);
		System.out.println(" ");
		System.out.println(" Endereço: " + EnderecoF);
		System.out.println("---------------------------");
	}
}
