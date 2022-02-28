public class mortgagePaymentQ5 {
    public static void main(String[] args) {
        //variable declaration and initialization
        Double p = 76000.0;
        Double r = 0.05;
        int n = 300;

        Double payment = (p*r*((1+r)*Math.exp(n))) / ((1+r)*Math.exp(n))-1;

        //displaying
        System.out.println(payment);


    }
}
