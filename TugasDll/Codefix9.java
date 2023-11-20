package TugasDll;
import  java.util.Scanner;

class Program {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for(int a=1;a<=N ;a++) {
            sum += a;
        }
        System.out.println(sum);
    }
}