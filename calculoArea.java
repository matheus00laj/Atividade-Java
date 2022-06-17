package cursojava;
import java.util.Scanner;

public class calculoArea {
	public static void main(String[] args) {
		int op=0, cont=0;
		Scanner scan = new Scanner(System.in);
		quadrilatero qLados = new quadrilatero();
		do {
			System.out.println("Digite a opção desejada:");
			System.out.println("1- Cálculo de Área de um Quadrado");
			System.out.println("2- Cálculo de Área de um Retangulo");
			System.out.println("3- Cálculo de Área de um Trapézio");
			op = scan.nextInt();
			qLados.quadrilatero(op);
			System.out.println("Deseja continuar?");
			System.out.println("1-SIM");
			System.out.println("2-NÃO");
			cont = scan.nextInt();
			switch(cont) {
				case 1:
					cont = 0;break;
				case 2:
					cont = 1;break;
				default:
					System.out.println("COMANDO INVÁLIDO! O PROGRAMA IRÁ REINICIAR!\n\n");
					cont = 0;break;
			}
		}while(cont==0);
	}
}
class quadrilatero{
	double base, baseMaior, baseMenor, altura;
	
	public void quadrilatero(int op) {
		Scanner real = new Scanner(System.in);
		switch(op) {
			case 1:{
				System.out.println("Digite o Lado do quadrado (cm):");
				base = real.nextDouble();
				System.out.println("ÁREA DO QUADRADO:"+quadrilatero(base)+"cm²");
				break;
				}
			case 2:{
				System.out.println("Digite a base do Retangulo(cm):");
				base = real.nextDouble();
				System.out.println("Digite a altura do Retangulo(cm):");
				altura = real.nextDouble();
				System.out.println("ÁREA DO RETANGULO(cm):"+quadrilatero(base, altura)+"cm²");
				break;
				}
			case 3:{
				System.out.println("Digite a base maior do trapezio(cm):");
				baseMaior = real.nextDouble();
				System.out.println("Digite a base menor do trapezio(cm):");
				baseMenor = real.nextDouble();
				System.out.println("Digite a altura do trapezio(cm):");
				altura = real.nextDouble();
				System.out.println("ÁREA DO TRAPÉZIO:"+quadrilatero(baseMaior, baseMenor, altura)+"cm²");
				break;
			
				}
			default:
				System.out.println("OPÇÃO INVÁLIDA!");break;
		}
	}
	public double quadrilatero(double base) {
		return base*base;
	}
	public double quadrilatero(double base, double altura) {
		return base*altura;
	}
	
	public double quadrilatero(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior*baseMenor)*altura)/2;
	}
}
