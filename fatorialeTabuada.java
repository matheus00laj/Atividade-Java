package cursojava;
import java.util.Scanner;
public class fatorialeTabuada {
	public static void main(String[] args) {
		int continuar=0, opt;
		fatoreTabuada ft = new fatoreTabuada();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Digite um número:");
			ft.numero = scan.nextInt();
			System.out.println("Digite o que deseja fazer com o número:");
			System.out.println("1-FATORIAL");
			System.out.println("2-TABUADA");
			opt = scan.nextInt();
			switch(opt) {
				case 1:System.out.println(ft.numero+"! ="+ft.fator());break;
				case 2:ft.tabuada();break;
			}
			System.out.println("DESEJA VOLTAR AO MENU?");
			System.out.println("1-SIM");
			System.out.println("2-NÃO");
			continuar = scan.nextInt();
			switch(continuar) {
				case 1: continuar=0;break;
				case 2: continuar=1;break;
				default: System.out.println("INVÁLIDO! O PROGRAMA IRÁ REINICIAR!"); continuar=0;break;
			}
			
		}while(continuar==0);
		
		
	}

}

class fatoreTabuada{
	int numero;
	long result;
	
	public void tabuada() {
		int i=0;
		System.out.println("Tabuada do :"+numero);
		for(i=1; i<=10;i++) {
			System.out.println((numero)+"*"+(i)+"="+numero*i);
		}
	}
	
	public long fator() {
		int numero1 = numero-1;
		result = numero;
		for(int i=1; i<numero1; numero1--) {
			result = result*numero1;
		}
		return result;
	}
}
