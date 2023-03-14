class Solution {
  public int[] solution(int n) {
        int[] answer = new int[(n+1)/2]; // 홀수의 개수만큼 배열 크기 설정
        int index = 0; // 배열 인덱스 -> 요소의 위치를 나타내는 정수값 
        for (int i = 1; i <= n; i += 2) { // 1부터 n까지 2씩 증가하면서 홀수 저장
            answer[index++] = i;
        }
        return answer;
  }
}