import java.util.Scanner;
public class Lista0103{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		float n1, n2, n3, media;
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextFloat();
		media = (n1*2)/10 + (n2*3)/10 + (n3*5)/10;
		System.out.println("Media total: "+ media);			
	}
}
