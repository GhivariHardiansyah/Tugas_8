package TugasDll;
import java.util.Scanner;
class Demo{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int nilai = sc.nextInt();
	
		if (nilai > 0){
			System.out.println("Bilangan Positif");
		}	else {
			System.out.println("Bilangan Negatif");
		}
	}
}