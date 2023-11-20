package TugasDll;
import  java.util.Scanner;

class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int pilihan;

        if (sc.hasNextInt()) {
            pilihan = sc.nextInt();
            if (pilihan >=0 && pilihan<menu.length) {
                String minumanTerpilih = menu[pilihan];
                System.out.print(minumanTerpilih);
            }  else {
                  System.out.println("Invalid");
                }
        }   else {
                System.out.println("Pilihan Tidak Tersedia. Dimohon memasukkan pernyataan yang benar.");
            }
        sc.close(); 
    }

}