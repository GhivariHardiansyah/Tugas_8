package tugas7;
import java.util.Scanner;
class Array_1{
public static void main(String[] args){
	Scanner aseli = new Scanner(System.in);
		
		System.out.print("TOTAL DATA INPUT = ");		
		int totaldata = aseli.nextInt();	
		int a[] = new int[totaldata];
		int total = 0;

		
		System.out.println("----- DATA-DATA -----");
		for (int i = 0; i < a.length; i++){
			System.out.print("Data ke-"+i+" = ");
			a[i] = aseli.nextInt();
		}
		
		
		System.out.println("-----------------------");
		System.out.println("MENENTUKAN GANJIL GENAP");
		System.out.println("-----------------------");
		for (int c = 0; c < a.length; c++){
			if (a[c]%2 == 0){
				System.out.println(a[c]+"\t---> BILANGAN GENAP");
			}	else{
				System.out.println(a[c]+"\t---> BILANGAN GANJIL");
			}
		}
		
		
		for(int d = 0; d<totaldata; d++){
		total += a[d];		
		}
		System.out.println("------ TOTAL ------");
		System.out.println("TOTAL PENJUMLAHAN DATA \n= "+total);
		System.out.println("----- RATA-RATA -----");
		double Rata_Rata = total / totaldata;
		System.out.println("RATA-RATA \n= "+Rata_Rata);
	}
}	