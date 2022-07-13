package cursojava;

public class classeAviao {

	public static void main(String[] args) {
		airplane boeing = new airplane();
		boeing.tipoAviao = "boeing 747";
		boeing.assentos =  200;
		boeing.janelas = 180;
		boeing.litrosDeGasolina = 2000000;
		boeing.voando(false);
		boeing.abastecido(false);
		boeing.passageiros(false);
		System.out.println("TIPO:");
		System.out.println("QUANTIDADE DE ASSENTOS:");
		System.out.println("QUANTIDADE DE JANELAS:");
		System.out.println("LITROS DE GASOLINA SUPORTADO:");
		System.out.println("O AVIÃO ESTÁ VOANDO:"+boeing.voando(false));
		System.out.println("O AVIÃO ESTÁ ABASTECIDO:"+boeing.abastecido(false));
		System.out.println("O AVIÃO ESTÁ COM PASSAGEIROS"+boeing.passageiros(false));
		

	}

}
class airplane{
	String tipoAviao;
	int assentos;
	int janelas;
	double litrosDeGasolina;
	
	
	
	boolean voando(boolean flying) {
		return flying;
	}
	boolean abastecido(boolean cheioOUvazio) {
		return cheioOUvazio;
	}
	boolean passageiros(boolean comOUsem) {
		return comOUsem;
	}
}
	
