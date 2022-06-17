package cursojava;
import java.util.Scanner;
public class AtividadeCompilada {
	public static void main(String[] args) {
		int op=0;
		int continuar = 0;
		Scanner scan = new Scanner(System.in);
		Scanner cont = new Scanner(System.in);
		do {
			
		
			System.out.println("Digite a Opção desejada:");
			System.out.println("1-Calculadora");
			System.out.println("2-Saudação");
			op = scan.nextInt();
			switch(op) {
				case 1:
					calculadora();break;
				case 2:
					horario();break;
			}
			System.out.println("Deseja Continuar?");
			System.out.println("1-Sim");
			System.out.println("2-não");
			continuar = scan.nextInt();
			switch(continuar){
				case 1:
					continuar=0;break;
				case 2:
					continuar=1;break;
				default:
					System.out.println("OPÇÃO INVÁLIDA! O PROGRAMA IRÁ FECHAR!");
					continuar=1;break;
			}
		}while(continuar == 0);
	}
	
	
	static void calculadora(){
		double numero1, numero2;
		String op;
		Scanner scan = new Scanner(System.in);
		Scanner strscan= new Scanner(System.in);
		
		System.out.println("DIGITE O PRIMEIRO NUMERO:");
		numero1 = scan.nextDouble();
		
		System.out.println("DIGITE O OPERADOR");
		op = strscan.next();
		
		System.out.println("DIGITE O SEGUNDO NUMERO:");
		numero2 = scan.nextDouble();
		
		System.out.println("RESULTADO: "+(numero1)+" "+(op)+" "+""+(numero2)+" "+"="+" "+calculo(op, numero1, numero2));
	
	}
	
	
	static double calculo(String op, double numero1, double numero2) {
		double resultado=0;
		switch(op) {
		case "+":
			resultado = numero1+numero2;break;
		case "-":
			resultado = numero1-numero2;break;
		case "*":
			resultado = numero1*numero2;break;
		case "/":
			resultado = numero1/numero2;break;
		case "%":
			resultado = numero1%numero2;break;
		}
		
		
		return resultado;
	}
	
	
	static void horario() {
		int horas, minutos;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a Hora:");
		horas= scan.nextInt();
		System.out.println("Digite os Minutos:");
		minutos = scan.nextInt();
		saudacoes(horas, minutos);
		
		
	}
	
	
	static void saudacoes(int horas, int minutos) {
		if(horas > 4 && horas < 12) {
			System.out.println("Bom dia!");
		}
		else if(horas >= 12 && horas < 18){
			System.out.println("Boa Tarde!");
		}
		else if(horas >= 18 && horas <=23) {
			System.out.println("Boa noite!");
		}
		else {
			System.out.println("Boa Madrugada!");
		}
	}
}
