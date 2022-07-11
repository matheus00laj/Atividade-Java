package cursojava;
import java.util.Scanner;

public class exerciciosGen {
	public static void main(String[] args) {
		expression formula = new expression();
		Scanner scan = new Scanner(System.in);
		formula.a = scan.nextDouble();
		formula.b = scan.nextDouble();
		formula.c = scan.nextDouble();
		formula.rM();
		formula.sM();
		formula.dM();
		formula.print();
	}

}
class expression{
	double a,b,c,d,r,s;
	
	double rM() {
		r=(a+b)*(a+b);
		return r;
	}
	double sM() {
		s=(b+c)*(b+c);
		return s;
	}
	double dM() {
		d=(r+s)/2;
		return d;
	}
	void print() {
		System.out.println("Resultado:"+d);
	}
	
}
