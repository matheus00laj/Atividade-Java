package cursojava.classe;

public class bicicleta{
	int cadencia;
	double velocidade;
	int marcha;
	
	
	public void mudarCadencia(int novoValor) {
		cadencia = novoValor;
	}
	public void mudarMarcha(int novoValor) {
		marcha = novoValor;
	}
	public void acelerar(double incremento) {
		velocidade= velocidade + incremento;
		
	}
	public void desacelerar(double decremento) {
		velocidade= velocidade + decremento;
	}
	public void printar() {
		System.out.println("cadencia:"+cadencia+" velocidade:"+velocidade+"marcha:"+marcha);
	}
}

class montanha extends bicicleta{
	int suspensao;
	
	public void suspensorio(int valor) {
		suspensao = valor;
	}
	public void printar() {
		System.out.println("suspensão:"+ suspensao);
	}
	
	
}