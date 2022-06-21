package cursojava;
import java.util.Scanner;

public class exercicioRepeticao {
	public static void main(String[] args) {
		int i=0, continuar=0, opt;
		Scanner inteiro = new Scanner(System.in);
		alunos turmaA = new alunos();
		do {
			System.out.println("Digite a opção desejada:");
			System.out.println("1-REGISTRAR ALUNO");
			System.out.println("2-LISTAGEM");
			opt = inteiro.nextInt();
			switch(opt) {
				case 1: i= turmaA.registro();break;
				case 2: turmaA.printar(i);break;
			}
			System.out.println("DESEJA VOLTAR AO MENU?");
			System.out.println("1-SIM");
			System.out.println("2-NÃO");
			continuar = inteiro.nextInt();
			switch(continuar) {
			case 1: continuar=0;break;
			case 2: continuar=1;break;
		}
		}while(continuar==0);
	}

}

class alunos{
	String[] aluno = new String[10];
	double[] nota = new double[10];
	
	public int registro() {
		Scanner nomeAluno = new Scanner(System.in);
		Scanner notaAluno = new Scanner(System.in);
		Scanner cont = new Scanner(System.in);
		int i=0, continuar;
		
		for(i=0; i<20; i++) {
			System.out.println("Digite o nome do "+(i+1)+" Aluno:");
			aluno[i] = nomeAluno.next();
			System.out.println("Digite a Nota do "+(i+1)+" Aluno:");
			nota[i] = notaAluno.nextDouble();
			
			System.out.println("Deseja Continuar?");
			System.out.println("1-SIM");
			System.out.println("2-NÃO");
			continuar = cont.nextInt();
			if(continuar ==2) {
				break;
			}
		}
		return i;
		
	}
	
	public void printar(int indice) {
		int i, continuar;
		Scanner inteiro = new Scanner(System.in);
		for(i=0; i<=indice; i++) {
			System.out.println("ALUNO "+(i+1)+":");
			System.out.println("Nome:"+aluno[i]);
			System.out.println("Nota:"+nota[i]);
			System.out.println("------------------------------");
			
		}
		System.out.println("DESEJA CONTINUAR?");
		System.out.println("1-SIM");
		System.out.println("2-NÃO");
		continuar = inteiro.nextInt();
		switch(continuar) {
			case 1: continuar=0;break;
			case 2: continuar=1;break;
	}
	}
}