class Solution {
    public int solution(int n) {
        String [] string = String.valueOf(n).split("");
        
        int result = 0;
        for(String s : string){
            result += Integer.parseInt(s);
        }
        return result;
    }
}