package tugas3;
public class Perpindahan {
	public static void main(String[] args) {
		int A = 2;
		int B = 4;
		int Simpanan;
		
		Simpanan = A;
		A=B;
		B=Simpanan;
		
		System.out.println("A: "+A);
		System.out.println("B: "+B);
	}

}