public class populationFunction {
    public static void main(String[] args) {
        //variables
        int X = 15;
        Double population = 5 / (1 + Math.exp(-2*(X-3)));

        //displaying
        System.out.println(population);
    }
}
