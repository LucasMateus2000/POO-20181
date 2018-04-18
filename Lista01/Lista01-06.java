import java.util.Scanner;
public class Lista0106{
	public static void main(String args[]){		
		String nome;
		int diarias;
		double mult, conta;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();
		System.out.println("Quantas diarias voce deseja escolher? ");
		diarias = ler.nextInt();
		if (diarias==15){
			mult = 6.00;
			conta = mult*diarias;
			System.out.println(nome +" sua conta é de R$"+ conta);
		}
		else if (diarias < 15){
			mult = 8.00;		
			conta = mult*diarias;
			System.out.println(nome +" sua conta é de R$"+ conta);
		}
		else if (diarias > 15){
			mult = 5.50;		
			conta = mult*diarias;
			System.out.println(nome +" sua conta é de R$"+ conta);	
		}		
	}
}
