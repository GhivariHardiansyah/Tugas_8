package TugasDll;
import java.util.Scanner;
class simple{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

		int [] a ={2,3,10,9,19,4};
		int jumdata = a.length;
		
		for (int i = 0; i < jumdata; i++){
			System.out.println("Data ke-"+i+" = "+a[i]);
		}
			
		for (int c = 0; c < jumdata; c++){
			System.out.print(a[c]+" ---> BILANGAN ");
			if (a[c] % 2 == 0){
				System.out.println("GENAP");
			}	else {
				System.out.println("GANJIL");
			}
		}
		for (int d = 0; d< jumdata; d++){
			System.out.println(a[d]);
		}	





	}
}	