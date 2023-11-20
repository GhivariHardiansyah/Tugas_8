package TugasDll;
import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int batas = 1;
        for(int i=1;i<=N;i++) {
            batas*= i;
        }
        System.out.println(batas);
   }
}