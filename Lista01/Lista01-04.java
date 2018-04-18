import java.util.Scanner;
public class Lista0104{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		float n1, n2, n3, n4, media;
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextFloat();
		System.out.println("Digite a quarta nota: ");
		n4 = ler.nextFloat();
		media = (n1+n2+n3+n4)/4;
		System.out.println("Media total: "+ media);
		
		if(media>=7.0){			
			System.out.println("Aprovado.");
		}
		else if(media>=5.0 && media<=7.0){
			System.out.println("Vai pra final.");	
		}
		else{
			System.out.println("Reprovado.");
		}		
	}
}
