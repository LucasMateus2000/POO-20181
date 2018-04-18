import java.util.Scanner;
public class Lista0109{
		public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seus numeros");
		int impar = 0, par = 0;
		Float n1 = ler.nextFloat(), n2 = ler.nextFloat(), menor, maior;
		Float soma = n1 + n2;
		if(n1 > n2){
			maior = n1;
			menor = n2;
		} 
		else {
			maior = n2;
			menor = n1;
		}
		
		System.out.println("A soma dos dois numeros é: " + soma);
		while(maior > (menor+1)){
			if((maior - 1)%2 != 0){
				impar += 1;
			} else {
				par += 1;
			}
			maior = maior - 1;
		}
		System.out.println("Impares: " + impar + ". Pares: " + par);
	}
}
