class Solution {
    public int solution(int hp) {
        int generalAntPower = 5;
        int soldierAntPower = 3;
        int workerAntPower = 1;
        
        int count = 0;
        
        while ( hp >= generalAntPower ){
        hp = hp - generalAntPower;
        count++;
    }
    
    while ( hp >= soldierAntPower ) {
        hp = hp - soldierAntPower;
        count++;
    }
    
    while ( hp >= workerAntPower ){
        hp = hp - workerAntPower;
        count++;
    }
    return count;
    }
}

