package cursojava;
import java.util.Scanner;
public class vetorMatriz {
	public static void main(String[] args) {
		int[] nota = new int[5];
		int i=0, maiorNota=0;
		double media=0;
		Scanner scan = new Scanner(System.in);
		
		
		for(int notas : nota) {
			System.out.println("Digite a "+(i+1)+" nota:");
			nota[i] = scan.nextInt();
			i++;
			
		}
		i=0;
		for(int notas : nota) {
			if(nota[i] > maiorNota || maiorNota == 0) {
				maiorNota = nota[i];
			}
			
			i++;
		}
		i=0;
		System.out.print("Notas:");
		
		for(int notas : nota) {
		System.out.print(nota[i]+",");	
			media = media+nota[i];
			i++;
		}
		media=media/5;
		System.out.println();
		System.out.println("Maior nota:"+maiorNota);
		System.out.println("Média:"+media);
		
		
		
		
	}
}
