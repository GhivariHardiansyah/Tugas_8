package TugasDll;
import java.io.*;

public class Input {
	public static void main(String [] args) throws IOException {
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
		
		String inputan = bfn.readLine();
		String panjangInputan = bfn.readLine();
		int panjang = Integer.parseInt(panjangInputan);	
		System.out.println(panjang);	
	}
}