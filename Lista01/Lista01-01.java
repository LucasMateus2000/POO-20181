import java.util.Scanner;
public class Lista0101{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digitem um valor em m/s");

		float metro = ler.nextFloat();

		metro = (float)metro * (float)3.6;

		System.out.println(metro);
	}
}
