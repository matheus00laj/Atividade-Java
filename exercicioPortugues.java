package cursojava;
import java.util.Scanner;
public class exercicioPortugues {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		calculo receber = new calculo();
		
		receber.numero =  scan.nextInt();
		System.out.println("calculo:"+receber.somas());
	}

}
class calculo{
	int numero;
	
	int somas() {
		int contador=0, receptor=0;
		do {
			contador++;
			receptor=receptor+contador;
			
		}while(contador<numero);
		return receptor;
	}
}
