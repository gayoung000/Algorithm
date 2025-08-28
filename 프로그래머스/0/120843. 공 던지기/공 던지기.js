function solution(numbers, k) {
    let result = 0;
    let n = numbers.length;
    let i = 0;
    
    while(true){
        result++;
        if (result === k){
            return numbers[i];
        }
        
        i += 2;
        
        if (i >= n) {        
            i = i-n;
        }
    }
    
}