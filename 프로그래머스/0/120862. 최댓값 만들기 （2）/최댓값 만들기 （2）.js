function solution(numbers) {
    // 길이가 2일 때 
    if (numbers.length == 2) {
        return numbers[0] * numbers[1];
    }
    
    
    [ -10, -3, 2, 1 ]
    
    
    // 길이가 2보다 클 때 
    const plus = numbers.filter((a) => a >= 0).sort((a,b) => b-a);
    const minus = numbers.filter((b) => b < 0).sort((a,b) => a-b);
   let result1 = -999999;
    let result2 = -999999;

    if (plus.length >= 2) {
        result1 = plus[0] * plus[1];
    } else if (plus.length == 1) {
        result1 = plus[0];
    } else {
        result1 = 0;
    }

    if (minus.length >= 2) {
        result2 = minus[0] * minus[1];
    } else if (minus.length == 1) {
        result2 = minus[0];
    } else {
        result2 = 0;
    }

    return result1 > result2 ? result1 : result2;
}