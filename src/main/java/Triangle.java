public class Triangle {


    public static double redSquare(int a, int b, int c) {

        double p = (double)( a + b + c) / 2.0;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return s;

    }


}
