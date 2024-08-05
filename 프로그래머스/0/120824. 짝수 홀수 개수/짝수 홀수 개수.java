class Solution {
    public int[] solution(int[] num_list) {
        
        int even = 0;
        int odd = 0;
        int[] arr = new int[2]; 
        
        for (int num : num_list){
            if(num % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        arr[0] = even;
        arr[1] = odd;
        
        return arr;
    }
}