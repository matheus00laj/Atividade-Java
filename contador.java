package cursojava;

public class contador {
	public static void main(String[] args) {
		numeros numero1 = new numeros();
		numero1.numero=233;
		numero1.contar();
		
	}

}

class numeros{
	int numero;
	
	public void contar() {
		do {
			System.out.println(numero);
			if(numero<300 || numero>400) {
				numero=numero+5;
			}
			else if(numero>=300 && numero<=400) {
				numero=numero+3;
			}
			
		}while(numero<456);
	}
	
}
