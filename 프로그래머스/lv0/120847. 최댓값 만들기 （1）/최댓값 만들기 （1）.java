class Solution {
    public int solution(int[] numbers) {
        int maxProduct = Integer.MIN_VALUE;
        
        // 모든 가능한 두 숫자 쌍에 대해 곱셈을 수행하고 최댓값 갱신
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int product = numbers[i] * numbers[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        
        return maxProduct;
    }
}