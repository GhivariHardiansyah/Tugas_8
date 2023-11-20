package TugasDll;
import java.util.Scanner;
class Demo{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Masukkan Nilai Tinggi = ");
	int t = sc.nextInt();
	System.out.println("Masukkan Nilai Alas = ");
	int a = sc.nextInt();
	
	int Luas = a * t / 2;
	System.out.println("Luas = "+Luas);
	}	
}