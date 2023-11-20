package TugasDll;
import java.util.Scanner;

public class Profit{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		int nilaiModal = input.nextInt();
		double persenKeuntungan = input.nextInt();
		double profit =(nilaiModal + (nilaiModal * persenKeuntungan));
		
		System.out.println("Nilai Modal = "+nilaiModal);
		System.out.println("Persen Keuntungan = "+persenKeuntungan);
		System.out.println("Profit = "+profit);
		
	}	
}	