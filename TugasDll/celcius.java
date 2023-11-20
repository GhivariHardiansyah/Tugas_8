package TugasDll;
import  java.util.Scanner;

class Program {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
		int waterTemperature = sc.nextInt();

        if ( waterTemperature >=100) {
            System.out.println("Boiling");    
        }  else if (waterTemperature <=100) {
            System.out.println("Not boiling");
        }   else {
            System.out.println("Really?");
        }
    }
}