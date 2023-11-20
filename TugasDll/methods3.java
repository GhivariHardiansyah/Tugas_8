package TugasDll;
class Demo {
    static void perc(double num, int percentage) {
        double res = num*percentage/100;
        System.out.println(res);
    }
    public static void main(String[] args) {
        perc(530, 23);
    }
}