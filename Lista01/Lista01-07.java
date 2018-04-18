import java.util.Scanner;
public class Lista0107{
	public static void main(String args[]){
	Scanner ler = new Scanner(System.in);
	int nota;
	System.out.println("Digite a nota: ");
	nota = ler.nextInt();
	if (nota>=0 && nota<=49){
		System.out.println("Insuficiente");
		}
	else if (nota>=50 && nota<=64){
		System.out.println("Regular");
		}
	else if (nota>=65 && nota<=84){
		System.out.println("Bom");
		}
	else if (nota>=85 && nota<=100){
		System.out.println("Otimo");
		}
	}	
}
	
