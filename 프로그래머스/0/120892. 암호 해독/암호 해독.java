class Solution {
    public String solution(String cipher, int code) {
        // code번째 배열
        int cnt = 0; // 카운트 선언 
        
        for (int i = code - 1; i < cipher.length(); i += code){
            cnt++;
        }
        
        
        char[] arr = new char[cnt]; // 문자열 선언
        
        cnt = 0;
        
        for (int i = code - 1 ; i < cipher.length(); i += code){
            arr[cnt] = cipher.charAt(i);
            cnt++;
        }
        
        String str = String.valueOf(arr);
        return str;
    }
}