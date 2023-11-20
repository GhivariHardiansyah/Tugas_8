package TugasDll;
import java.util.Scanner;

class Program {
    
    public static void main(String[] args) {
        int[][] bangku = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
    };
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int baris = sc.nextInt();
        int kolom = sc.nextInt();

        if (kolom>=0&&kolom<bangku[baris].length&&baris>=0&&baris<bangku.length) {
            if (bangku[baris][kolom]==0) {
                System.out.println("Free");
            } else {
                System.out.println("Sold");
            }
        }
        sc.close();
    }

}
public class Codefix13 {
    
}
