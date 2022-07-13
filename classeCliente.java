package cursojava;

public class classeCliente {
	public static void main(String[] args) {
		cliente numero1 = new cliente();
		numero1.nome = "matheus";
		numero1.idade = 21;
		numero1.codigo = 3123;
		numero1.altura = 1.80;
		numero1.printar();
		numero1.maiorOUmenor();
	}
}

class cliente{
	String nome;
	int idade, codigo;
	double altura;
	
	void printar() {
		System.out.println("Nome do Cliente:"+nome);
		System.out.println("Código do Cliente:"+codigo);
		System.out.println("Idade do Cliente:"+idade);
		System.out.println("Altura do Cliente:"+altura);
	}
	void maiorOUmenor() {
		if(idade >= 18) {
			System.out.println("O Cliente "+nome+" é maior de idade");
		}
		else {
			System.out.println("O Cliente "+nome+" é menor de idade");
		}
	}
	
}