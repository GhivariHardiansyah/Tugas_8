package tugas7;
import java.util.Scanner;
class Array{
	public static void main(String[] args){
		Scanner aseli = new Scanner(System.in);
			
		int harga [] = {2500,3000,4000,5000,6000};
		int datajumlah = harga.length;
		int barang[] = new int[harga.length];
		int totalharbang = 0;
		int total_item_belanja = 0;
		int total_harga = 0;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("----- Inputkan Data Jumlah Barang -----");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int n=0; n<datajumlah; n++) {
			System.out.print("Jumlah Belanja Item-" + n +(" Rp ")+ harga[n] + " = " );
			barang[n] = aseli.nextInt();	
		}
			
			

		for(int n=0; n<datajumlah; n++){
			totalharbang += barang[n] * harga[n];
			System.out.println("Harga Barang ke-" + n + ", " + harga[n] + ", " + barang[n] + " item : " + totalharbang);
		}
			
			
		for (int n=0; n<datajumlah; n++){
		total_item_belanja += barang[n];
		}
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("----- TOTAL ITEM BELANJA -----");
		System.out.println("------------------------------");
		System.out.println("Total Item Belanja = " + total_item_belanja);
		System.out.println("");
		for (int n=0; n<datajumlah; n++){
		total_harga += harga[n];
		}
		System.out.println("-----------------------");
		System.out.println("----- TOTAL HARGA -----");
		System.out.println("-----------------------");
		System.out.println("Total Belanja = " + total_harga);
	}
}	