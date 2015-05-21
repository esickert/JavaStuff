public class Test   {
    public static void main(String[] args) {

        double test = (100 * 0.05 / (1 - (Math.pow(1 / (1 + 0.05),1 * 12))));
        System.out.println((int)(test * 100)/100);
    }
}
