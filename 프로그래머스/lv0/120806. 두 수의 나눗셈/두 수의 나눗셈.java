class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1>0 && num1<=100 && num2>0 && num2 <=100) {
            double result = (double)num1/num2;
            result = result * 1000;
            return (int)result;
        }
        return answer;
    }
}

// 간단 해설 
/* 만약 이 조건이 모두 만족하면, num1을 num2로 나눈 값을 double 자료형으로 저장한 다음, 1000을 곱한 결과를 int 자료형으로 변환하여 answer 변수에 대입합니다.

그리고나서 answer 값을 반환합니다. 만약 num1 또는 num2가 0 이하이거나 100 이상인 경우, answer 변수는 초기화된 상태 그대로 0이므로 solution 메서드는 0을 반환합니다.*/