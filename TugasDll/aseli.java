package TugasDll;
import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		int menu, porsi, harga = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Bakso\n2. Mie ayam");
		System.out.print("Pilihan \t= ");
		menu = input.nextInt();
		switch (menu){
			case 1:
				System.out.println("Harga 1 porsi \t= 5K");
				System.out.print("Porsi \t\t= ");
				porsi = input.nextInt();
				harga = 5000 * porsi;
				System.out.print("Total Harga \t= "+ harga);
			break;
			case 2:
				System.out.println("Harga 1 porsi \t= 8k");
				System.out.print("Porsi \t\t= ");
				porsi = input.nextInt();
				harga = 8000*porsi;
				System.out.print("Total Harga \t= "+ harga);
			break;	
			default:
				System.out.print("Tidak ada di menu");
			}
	
		
	}
}