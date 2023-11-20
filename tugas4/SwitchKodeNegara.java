package tugas4;
import java.util.Scanner;

public class SwitchKodeNegara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String kodeNegara = sc.nextLine().toUpperCase();
		String namaNegara;
		
		switch (kodeNegara) {
			case "ID":
				namaNegara = "Indonesia";
				break;
		    case "MS":
				namaNegara = "Malaysia";
				break;
			case "RS":
				namaNegara = "Russia";
				break;
			case "BD":
				namaNegara = "Brunei Darussalam";
				break;
			case "IN":
				namaNegara = "India";
				break;
				
				default:
					namaNegara = ("maaf,kode negara tidak diketahui");
					break;
		}
		System.out.println("Kode Negara = "+ kodeNegara);
		System.out.println("Nama Negara = "+ namaNegara);
	}
}	