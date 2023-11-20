package TugasDll;
import java.util.Scanner;

class Goodjob {
    //your code goes here
    public static void bot() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input==1) {
            System.out.println("Order confirmed");
        } else if (input==2) {
            System.out.print("info@sololearn.com");
        } else {
            System.out.print("Try again");
        }
        scanner.close();
    }
    
    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again". 
    */
    public static void main(String[] args) {
        bot();
    }
}