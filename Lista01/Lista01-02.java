import java.util.Scanner;
public class Lista0102{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int idade, Aatual, Anasceu;
		System.out.println("Digite o ano atual: ");
		Aatual = ler.nextInt();
		System.out.println("Digite o ano que voce nasceu: ");
		Anasceu = ler.nextInt();
		idade = Aatual - Anasceu;
		System.out.println("Você tem "+idade+" anos.");			
	}
}
