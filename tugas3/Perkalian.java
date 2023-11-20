package tugas3;
import java.util.Scanner;

public class Perkalian{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int Q = input.nextInt();
		int V = input.nextInt();
		System.out.println("Nilai Q = "+Q);
		System.out.println("Nilai V = "+V);
		
		int Jumlah =(Q * V);
		System.out.println(Jumlah);
	
	}
}