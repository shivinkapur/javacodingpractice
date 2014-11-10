package findNthPrime;

import java.util.ArrayList;
import java.util.List;

public class FindNthPrime {
    public int findNthPrime(int n) {
        if (n < 0) {
            throw new RuntimeException("Invalid argument :" + n);
        }
        List<Integer> primeNoList = new ArrayList<Integer>();
        int primeNo = 2;
        primeNoList.add(primeNo);
        boolean iterateOverPrimeNoList = true;
        int primeListCnt = 0;
        int num = primeNo + 1;
        int denominator = primeNo;
        int primeCnt = 0;
        while (primeCnt < n) {
            System.out.println("main loop interation cnt : " + primeCnt);
            primeListCnt = 0;
            iterateOverPrimeNoList = true;
            // check if next num is not divisible by all prime numbers which are
            // less than half of the number
            while (primeListCnt < primeNoList.size() && iterateOverPrimeNoList) {
                denominator = primeNoList.get(primeListCnt);
                System.out.println("check num :" + num + " divisible by : " + denominator);
                if (num % denominator == 0) {
                    num++;
                    primeListCnt = 0;
                } else {
                    denominator = (primeListCnt + 1) < primeNoList.size() ? primeNoList.get(primeListCnt + 1) : denominator;
                    if (denominator < num / 2) {
                        primeListCnt++;
                    } else {
                        iterateOverPrimeNoList = false;
                    }
                }

            }

            primeCnt++;
            primeNoList.add(num);
            primeNo = num;
            System.out.println(primeCnt + " nth Prime no:" + num + " found ");
            num++;

        }
        System.out.println(primeNoList);
        return primeNo;
    }

    public static void main(String[] args) {
        System.out.println(new FindNthPrime().findNthPrime(10));
    }
}