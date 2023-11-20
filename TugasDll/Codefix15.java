package TugasDll;
import java.util.Scanner;
class Lesehan {
    //your code goes here
    static double convert(double kaki){
        double inci = kaki * 12;
        System.out.println(inci);
        return inci;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble(); 
        convert(num);
    }
}