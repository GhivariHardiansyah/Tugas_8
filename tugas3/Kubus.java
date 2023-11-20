package tugas3;
import java.util.Scanner;
	
public class Kubus{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int S = input.nextInt();
		System.out.println("Nilai Sisi = "+ S);
		
		int nilaiVolume = (S * S * S);
		int nilaiLuas = (6 * (S * S));		
		int nilaiKeliling = (12 * S);
		
		System.out.println("Nilai Volume = "+ nilaiVolume);
		System.out.println("Nilai Luas = "+ nilaiLuas);
		System.out.println("Nilai Keliling = "+nilaiKeliling);
	}		
}