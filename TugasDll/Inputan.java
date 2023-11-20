package TugasDll;
import java.io.*;
public class Inputan {
	public static void main(String [] args) throws IOException {
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

		double phi = 3.14;
		int a = 0 ;
		String jariJari = bfn.readLine();
		double jariJari = Integer.parseDouble(jariJari);	
		System.out.println(luasLingkaran);	
		
		double luas = phi * jariJari * jariJari;
		String panjang = bfn.readLine();
		int panjang = Integer.parseInt(luas);
		System.out.println(luas);
	}
}