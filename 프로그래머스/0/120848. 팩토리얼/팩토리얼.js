function solution(n) {
    let max = 0;

    function factorial(num) {
        let result = 1;
        for (let i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    for (let i = 1; i <= n; i++) {     
        let number = factorial(i);
        if (number <= n) {              
            max = Math.max(max, i);    
        } else {
            break;                    
        }
    }

    return max;
}


function factorial(n){
     if ( n === 1 || n === 0) {
            return 1;
        }
    
        return n * solution(n - 1);
}