package tugas2;
import java.util.Scanner;

public class PersegipScanner {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int panjang = sc.nextInt();
		int lebar = sc.nextInt();

		int luas = (panjang * lebar);
		int keliling = ((panjang + lebar)*2);

		System.out.println(panjang);
		System.out.println(lebar);
		System.out.println(luas);
		System.out.println(keliling);
    }
}