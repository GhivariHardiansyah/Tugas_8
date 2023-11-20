package TugasDll;
import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String prediket ;
		System.out.print("Nilai MTK = ");
		int Mtk = sc.nextInt();
		System.out.print("Nilai Bahasa Indonesia = ");
		int B_Indo = sc.nextInt();
		System.out.print("Nilai Bahasa Inggris = ");
		int B_Ing = sc.nextInt();
		System.out.print("Nilai PKN = ");
		int Pkn = sc.nextInt();
		
		double Rata_Rata = (Mtk + B_Indo + B_Ing + Pkn) / 4;
		System.out.println(Rata_Rata);
		if (Rata_Rata >= 80){
			prediket = "Aman";
			System.out.println(prediket);
			System.out.println("Anda Lulus");
		} else {
			System.out.println("Maaf Anda Tidak Lulus");
		}
	}	
}