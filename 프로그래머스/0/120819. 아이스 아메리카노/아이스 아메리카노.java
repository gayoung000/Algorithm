class Solution {
    public int[] solution(int money) {
        int[] result = new int[2];
        int num =0;
        int changes =0;
        
        if(money >= 5500){
            num = money / 5500;
            changes = money - (num*5500);
            
            result[0] = num;
            result[1] = changes;
        } else {
            result[0] = 0;
            result[1] = money;
        }
        
      return result;
    }
}





    
    

    

    

