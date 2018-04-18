import java.util.Scanner;
public class Lista0108{
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		int menor = 0,maior = 0,media = 0,n,total = 0;
		for (int i=1;i<10;i++){
			n = ler.nextInt();
			total += n;
			if (i==0){
			maior = n;
			menor = n;
			}
			else if (n>=maior && i!=0){
			maior = n;
			}
			else if(n<=menor && i!=0){
			menor = n;
			}
		}
		media = total/10;
		System.out.println("A media é "+ media + " o menor é "+ menor + " e o maior é " + maior);
	}
}
