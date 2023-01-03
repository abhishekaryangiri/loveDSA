package javaYogi;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor10 {
    public static List<Integer> getPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                factors.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        List<Integer> factors = getPrimeFactors(60);
        System.out.println(factors); // prints [2, 2, 3, 5]
    }
}
