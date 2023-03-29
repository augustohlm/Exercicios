package exercicio_1;

public class Retangulo {
	
private float alturaRetangulo, larguraRetangulo;
	
	public void gravarAlturaLarguraRetangulo(float altura, float largura) {
		alturaRetangulo = altura;
		larguraRetangulo = largura;
	}
	
	public float calculaAreaRetangulo() {
		return alturaRetangulo * larguraRetangulo;
	}
	
	public float calculaPerimetroRetangulo() {
		return (2 * alturaRetangulo) + (2 * larguraRetangulo);
	}
	public float altura() {
		return alturaRetangulo;
	}
	public float largura() {
		return larguraRetangulo;
	}
}
