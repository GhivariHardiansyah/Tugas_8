package TugasDll;
import java.util.Scanner;
class Demo{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
int pilihan =sc.nextInt();
switch (pilihan) {
    case 1:
        System.out.println("Ayam");
        break;
    case 2:
        System.out.println("Sapi");
        break;
    default:
        System.out.println("Pilihan Default");
		}

		

	}
}