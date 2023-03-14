import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
        // 2로 나누는 이유 : 짝수일 경우 두개 요소의 평균 값 , 홀수인경우 중앙값으로 정확히 하나의 요소 반환
        
    }
}