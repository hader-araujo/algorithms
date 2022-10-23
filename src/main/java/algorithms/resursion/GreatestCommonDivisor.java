package algorithms.resursion;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();

        {
            int a = 1482;
            int b = 819;
            int expectedResult = 39;
            int gcdResult;

            gcdResult = greatestCommonDivisor.euclidsAlgorithmSubtraction(a, b);
            System.out.println("gcd subtraction de %d e %d = %d".formatted(a, b, gcdResult));
            assert gcdResult == expectedResult;

            gcdResult = greatestCommonDivisor.euclidsAlgorithmDivision(a, b);
            System.out.println("gcd division de %d e %d = %d".formatted(a, b, gcdResult));
            assert gcdResult == expectedResult;
        }

        {
            int a = 252;
            int b = 105;
            int expectedResult = 21;
            int gcdResult;

            gcdResult = greatestCommonDivisor.euclidsAlgorithmSubtraction(a, b);
            System.out.println("gcd subtraction de %d e %d = %d".formatted(a, b, gcdResult));
            assert gcdResult == expectedResult;

            gcdResult = greatestCommonDivisor.euclidsAlgorithmDivision(a, b);
            System.out.println("gcd division de %d e %d = %d".formatted(a, b, gcdResult));
            assert gcdResult == expectedResult;
        }


        {
            int a = 252;
            int b = 254;
            int expectedResult = 2;
            int gcdResult;

            gcdResult = greatestCommonDivisor.euclidsAlgorithmSubtraction(a, b);
            System.out.println("gcd subtraction de %d e %d = %d".formatted(a, b, gcdResult));
            assert gcdResult == expectedResult;

            gcdResult = greatestCommonDivisor.euclidsAlgorithmDivision(a, b);
            System.out.println("gcd division de %d e %d = %d".formatted(a, b, gcdResult));
            assert gcdResult == expectedResult;
        }

    }

    private int euclidsAlgorithmSubtraction(int a, int b) {

        if (a == b) {
            return a;
        }

        int min = Math.min(a, b);
        int r = Math.abs(a - b);
        return euclidsAlgorithmSubtraction(min, r);
    }

    private int euclidsAlgorithmDivision(int a, int b) {

        if (b == 0) {
            return a;
        }

        int remainder = a % b;
        return euclidsAlgorithmDivision(b, remainder);
    }

}
