function solution(sides) {
    let result = 0;
    let maxNum = Math.max(...sides);
    let sum = sides[0] + sides[1];
    
    let i = 0;

    // 1. maxNum이 가장 크다면
    while(i <= maxNum){
        if(sum - maxNum + i > maxNum){
            result++;
        }
         i++;
    }
    
    // 새로운 한 변이 가장 크다면
    for(let z = maxNum+1; z < sum; z++){
        result++;
    }
    
    return result;
    
}