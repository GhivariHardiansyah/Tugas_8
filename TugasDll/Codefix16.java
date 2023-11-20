package TugasDll;
import java.util.Scanner;

class Program {
    //your code goes here
    static double fahrenheit(double celcius) {
        double fahrenheit = 1.8*celcius+32;
        return fahrenheit;
    }
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double celcius = sc.nextDouble(); 
        System.out.println(fahrenheit(celcius));
    }
}