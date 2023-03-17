import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분모의 최소공배수를 구함
        int lcd = denom1 * denom2 / gcd(denom1, denom2);
        // 분모가 최소공배수인 두 분수의 분자를 구함
        int numer = numer1 * (lcd / denom1) + numer2 * (lcd / denom2);
        // 분자와 분모의 최대공약수를 구함
        int divisor = gcd(numer, lcd);
        // 분자와 분모를 최대공약수로 나누어서 기약 분수를 만듦
        return new int[]{numer / divisor, lcd / divisor};
    }
    
    // 최대공약수를 구하는 함수
    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}