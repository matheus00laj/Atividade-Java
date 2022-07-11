package cursojava;

public class imparMultiplo3 {
	public static void main(String[] args) {
		calculos numero1 = new calculos();
		numero1.contador();
	}

}
class calculos{
	int numero=0, contador;
	
	public void contador() {
		for(contador=1; contador<=500; contador++) {
			if(contador%3==0 && contador%2==1) {
				numero=numero+contador;
			}
		}
		System.out.println(numero);
	}
	
}
