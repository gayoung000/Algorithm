class Solution {
    // 대문자 배열 만들기
    // 소문자 배열 만들기
    // my_string 돌려서 하나가 대문자에 속하면 소문자 출력
    // 소문자에 속하면 대문자 출력
    
    public String solution(String my_string) {
        char [] upper = new char[my_string.length()];
        char [] lower = new char[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++){
            upper[i] = Character.toUpperCase(my_string.charAt(i));
            lower[i] = Character.toLowerCase(my_string.charAt(i));
        }
    
        char[] result = new char[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) == upper[i]){
                result[i] = lower[i];
            } else if (my_string.charAt(i) == lower[i]){
                result[i] = upper[i];
            }
        }    
        return new String(result);
    }
}