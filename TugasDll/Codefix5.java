package TugasDll;
import  java.util.Scanner;
public class Codefix5 {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double tip = (bill*0.15);

        System.out.println(tip);
        
    }
}