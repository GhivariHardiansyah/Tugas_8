package tugas3;
import java.util.Scanner;

public class IP {
	public static void main(String[] args){	
		Scanner input = new Scanner(System.in);
		
		int Ttki = input.nextInt();
		System.out.println("Nilai TTKI = "+ Ttki);
		int studiAlquran = input.nextInt();
		System.out.println("Nilai Studi Al-Qur'an = "+ studiAlquran);
		int aqidahAkhlak = input.nextInt();
		System.out.println("Nilai Studi Aqidah Akhlak = "+ aqidahAkhlak);
		int Pkn = input.nextInt();
		System.out.println("Nilai PKN = "+ Pkn);
		
		//MAX NILAI IP = 400/4 = 100/25 = 4 
		double nilaiTotalMatkul =(Ttki + studiAlquran + aqidahAkhlak + Pkn);
		double Ip =( nilaiTotalMatkul / 4.0 / 25.0 ); 
		System.out.println("IP = "+ Ip);
	}

}