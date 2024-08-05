class Solution {
    public int[] solution(String[] strlist) {
        int N = strlist.length;
        int[] answer = new int[N];
        for(int i = 0; i < N; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}