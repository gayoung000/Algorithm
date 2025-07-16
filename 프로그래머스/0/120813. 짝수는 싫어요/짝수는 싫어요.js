
function solution(n) {
    let arr = Array.from({ length: n }, (_, i) => i + 1);
    let result = arr.filter((n)=> n % 2 !== 0);
    return result.sort((a,b) => a-b);
    
}
