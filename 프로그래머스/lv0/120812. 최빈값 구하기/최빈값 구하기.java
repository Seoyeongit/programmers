class Solution {
    public int solution(int[] array) {
        int[] answer = new int [1001];
        int maxCount = 0;
        int maxNum = 0;
        
         for (int num : array) {
            answer[num]++;
            if (answer[num] > maxCount) {
                maxCount = answer[num];
                maxNum = num;
            }
        }
        int freqCount = 0;
        for (int answers : answer) {
            if (answers == maxCount) {
                freqCount++;
            }
        }
        if (freqCount > 1) {
            return -1;
        }
        return maxNum;
    }
}