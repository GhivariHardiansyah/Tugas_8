package tugas3;
import java.util.Scanner;
	
	public class perpindahanNilai{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		int Y = input.nextInt();
		int Kosong;
		System.out.println("Sebelum : ");
		System.out.println("X = "+X);
		System.out.println("Y = "+Y);
		
		Kosong = X;
		X = Y;
		Y = Kosong;
		System.out.println("Sesudah : ");
		System.out.println("X: "+X);
		System.out.println("Y: "+Y); 
		}
	
	}