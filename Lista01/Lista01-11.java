import java.util.Scanner;
public class Lista0111{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int cntP=0,cntC=0,cntE=0,cntH=0,cntS=0,cntZ=0;
	float precoP=0,precoC=0,precoE=0,precoH=0,precoS=0,precoZ=0,desconto=0,conta;
	int codigo = 0;
	System.out.println("CARDAPIO\n");
	System.out.println("CÓDIGO| PRODUTO"); 
	System.out.println("10    | Pastel de carne\n");
	System.out.println("11    | Coxinha de frango\n");
	System.out.println("12    | Empada de frango\n");
	System.out.println("20    | Hamburguer\n");
	System.out.println("30    | Pizza\n");
	System.out.println("50    | Suco\n");
	System.out.println("0     | VER A CONTA");
	System.out.println("-1    | ENCERRAR");
	System.out.println("Digite o codigo que desejas?\n ");
	while (codigo!=-1){
		if (codigo == 10 ){
		precoP = 1.50f;
		cntP +=1;
		}
		else if (codigo == 11){
		precoC = 1.80f;
		cntC +=1;
		}
		if (codigo == 12){
		precoE = 1.90f;
		cntE += 1;
		}
		if (codigo == 20){
		precoH = 10.00f;
		cntH +=1;
		}
		if (codigo == 30){
		precoZ = 8.00f;
		cntZ +=1;
		}
		if (codigo == 50){
		precoS = 2.50f;
		cntS +=1;
		}
	System.out.println("Deseja mais alguma coisa?");
	}
	conta = (precoP*cntP)+(precoC*cntC)+(precoE*cntE)+(precoH*cntH)+(precoZ*cntZ)+(precoS*cntS);
	if (conta>=50){
		desconto = conta*0.05f;
		conta = conta - desconto;
	}
	System.out.println(conta);
	}

}
