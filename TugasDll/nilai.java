package TugasDll;
import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		Scanner Pf = new Scanner(System.in);
			
			System.out.print("Nilai Mtk \t= ");
			int Mtk = Pf.nextInt();
			
			if (Mtk >= 80){
				System.out.println("Luwh amat bagus");
			}	else if (Mtk >= 70) {
				System.out.println("WOKEHHHHH");
			}	else if (Mtk >= 60) {
				System.out.println("B ajah");
			}	else {
				System.out.println("HeHe");
			}
			
	}
}