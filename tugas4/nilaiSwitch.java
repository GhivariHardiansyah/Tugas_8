package tugas4;
import java.util.Scanner;

public class nilaiSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char Huruf = sc.next().charAt(0);
		double nilai;
		
		switch (Huruf) {
			case 'A':
				nilai = 4.0;
				break;
		    case 'B':
				nilai = 3.0;
				break;
			case 'C':
				nilai = 2.0;
				break;
			case 'D':
				nilai = 1.0;
				break;
			case 'E':
				nilai = 0;
				break;
				
				default:
				System.out.println("maaf,konversi nilai tidak diketahui");
					return;
		}
		System.out.println("Nilai = "+nilai);
	}
}	