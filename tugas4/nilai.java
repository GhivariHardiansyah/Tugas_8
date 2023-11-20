package tugas4;
import java.util.Scanner;

public class nilai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char Huruf = sc.next().charAt(0);
		double nilai;
		
		if (Huruf == 'A') {
            nilai = (4.0);    
        }  else if (Huruf == 'B') {
            nilai = (3.0);
        }  else if (Huruf == 'C') {
            nilai = (2.0);
		}  else if (Huruf == 'D') {
            nilai = (1.0);
		}  else if (Huruf == 'E') {
            nilai = (0);
		}  else {
            System.out.println("Maaf,konversi nilai tidak diketahui");
			return;
        }
		System.out.println("Nilai Konversi = "+ nilai);
	}
}
