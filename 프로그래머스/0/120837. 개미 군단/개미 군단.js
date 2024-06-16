function solution(hp) {
    const generalAntPower = 5;
    const soldierAntPower = 3;
    const workerAntPower = 1;
    
    let count = 0;
    
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