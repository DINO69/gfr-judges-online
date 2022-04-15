package br.com.guifr.hackerrank;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountTriplets {


    public static long of(List<Long> arr, long r) {

        Set<Long> setArr = arr.stream()
                .collect(Collectors.toSet());

        long result = 0;
        for(Long i : setArr){
            long j = i * r;
            long k = j * r;

            long countI = getCountNumberIn(arr, i);

            if(i == j && i == k) {
                result += IntStream.range(1, ((int)countI - 1))
                                    .mapToLong(CountTriplets::gauss)
                                    .sum();

                continue;
            }

            long countJ = getCountNumberIn(arr,j);

            long countK = getCountNumberIn(arr,k);

            result += ( countI * countJ * countK);


        }


        System.out.println(result);
        return result;
    }

    private static long getCountNumberIn(List<Long> arr, Long i) {
        return arr.stream()
                .filter(number -> number.intValue() == i)
                .count();
    }

    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

    public static long gauss(long number) {
        if(number == 0)
            return 0;

        if (number == 1)
            return 1;

        long sumGauss = number + 1;
        long amountGauss = number / 2;
        long remainder = number % 2;

        return sumGauss * amountGauss + (remainder * (sumGauss / 2));


    }
}
