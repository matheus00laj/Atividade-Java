package cursojava;

import java.util.Scanner;

public class atividadesOrientadas {
	public static void main(String[] args) {
		int op0=0, op1=0;
		
		Scanner str = new Scanner(System.in);
		Scanner inteiro = new Scanner(System.in);
		Scanner real = new Scanner(System.in);
		calculadoraa calc =  new calculadoraa();
		saudacoes saud = new saudacoes();
		
		do {
			System.out.println("Digite a Opção:");
			System.out.println("1-CALCULADORA\n2-SAUDAÇÃO\n");
			op0 = real.nextInt();
			switch(op0) {
				case 1:{
					System.out.println("Digite o Primeiro Numero:");
					calc.numero1 = real.nextDouble();
					System.out.println("Digite o operador:");
					System.out.println("[+] Soma");
					System.out.println("[-] Subtração");
					System.out.println("[*] Multiplicação");
					System.out.println("[/] Divisão");
					System.out.println("[%] Resto de Divisão");
					calc.op = str.next();
					System.out.println("Digite o Segundo Numero:");
					calc.numero2 = real.nextDouble();
					System.out.println(calc.numero1+" "+calc.op+" "+calc.numero2+"="+calc.calculo(calc.op, calc.numero1, calc.numero2));
					break;
				}
				case 2:{
					System.out.println("Digite as Horas:");
					saud.horas = inteiro.nextInt();
					System.out.println("Digite os Minutos:");
					saud.minutos = inteiro.nextInt();
					saud.saudacoes(saud.horas, saud.minutos);
					break;
				}
				default:
					System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE!");break;
				
			
			
			}
			System.out.println("Deseja Continuar?");
			System.out.println("1-Sim\n2-Não\n");
			op1 = inteiro.nextInt();
			switch(op1) {
				case 1:
					op1=0;break;
				case 2:
					op1=1;break;
				default:
					System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE!");break;
			}
		
		}while(op1==0);
	}
}

class calculadoraa {
	double numero1, numero2;
	String op;

	static double calculo(String op, double numero1, double numero2) {
		double resultado = 0;
		switch (op) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1 - numero2;
			break;
		case "*":
			resultado = numero1 * numero2;
			break;
		case "/":
			resultado = numero1 / numero2;
			break;
		case "%":
			resultado = numero1 % numero2;
			break;
		}

		return resultado;
	}

}

class saudacoes {
	int horas, minutos;

	static void saudacoes(int horas, int minutos) {
		if (horas > 4 && horas < 12) {
			System.out.println("Bom dia!");
		} else if (horas >= 12 && horas < 18) {
			System.out.println("Boa Tarde!");
		} else if (horas >= 18 && horas <= 23) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Boa Madrugada!");
		}

	}

}