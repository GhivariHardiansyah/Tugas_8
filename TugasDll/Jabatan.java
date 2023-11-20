package TugasDll;
import java.util.Scanner;
class UTS {
	public static void main(String[] args){
	String nama, jabatan;
	int jamKerja;
	long gaji;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nama = ");
		nama = sc.nextLine();
		System.out.print("Jabatan = ");
		jabatan = sc.nextLine();
		System.out.print("Jam Kerja = ");
		jamKerja = sc.nextInt();
	
		switch(jabatan){
			case "SF": 
				gaji = jamKerja*30500;
			break;
			
			case "MG":
				gaji = jamKerja*45000;
			break;
			
			default:
				gaji = 0;
			break;
		}
		System.out.print("Gaji = Rp."+gaji);
	}
}	