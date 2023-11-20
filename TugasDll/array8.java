package TugasDll;
class Demo {
    public static void main(String[] args) {
        int[] ages = {18, 33, 24, 64, 45};
        int sum = 0;
        for(int x: ages) {
            sum += x;
        }
        System.out.println(sum); 
    }
}
