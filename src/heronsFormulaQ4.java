public class heronsFormulaQ4 {
    public static void main(String[] args) {
        //variable declaration and initialization
        Double a = 4.0;
        Double b = 6.0;
        Double c = 8.0;

        Double s = (a + b + c) /2;

        Double Area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));

        //displaying
        System.out.println(Area);


    }
}
