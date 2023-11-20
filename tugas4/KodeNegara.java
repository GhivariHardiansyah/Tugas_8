package tugas4;
import java.util.Scanner;

public class KodeNegara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String kodeNegara = sc.nextLine();		
		String namaNegara;
		
		if (kodeNegara.equals ("ID")) {
            namaNegara = "Indonesia";    
        }  else if (kodeNegara.equals ("MS")) {
            namaNegara = "Malaysia";
        }  else if (kodeNegara.equals ("RS")) {
            namaNegara = "Russia";
		}  else if (kodeNegara.equals ("BD")) {
            namaNegara = "Brunei Darussalam";
		}  else if (kodeNegara.equals ("IN")) {
            namaNegara = ("India");
		}  else {
            namaNegara =("Maaf,Kode Negara Tidak Diketahui");
        }
		System.out.println("Kode Negara = "+ kodeNegara);
		System.out.println("Nama Negara = "+ namaNegara);
		
		sc.close();
	}
}
