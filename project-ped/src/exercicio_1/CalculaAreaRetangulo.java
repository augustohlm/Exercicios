package exercicio_1;

public class CalculaAreaRetangulo {

	public static void main(String[] args) {
		
		float area, perimetro, largura, altura;
		
		Retangulo ret = new Retangulo();
		
		ret.gravarAlturaLarguraRetangulo(5, 10);
		
		System.out.println("Qual é a altura do retângulo: ");
		area = ret.calculaAreaRetangulo();
		
		System.out.println("Qual é a largura do retângulo: ");
		 perimetro = ret.calculaPerimetroRetangulo();
		 
		 altura = ret.altura();
		 largura = ret.largura();
		
		System.out.format("A Altura inserida foi : %.3f", altura);
		System.out.println(""); 
		System.out.format("A Largura inserida foi : %.3f", largura);
		System.out.println("");
		System.out.format("A área é: %.3f", area);
		System.out.println("");
		System.out.format("O perimetro é: %.3f", perimetro);
		
		
	}

}
