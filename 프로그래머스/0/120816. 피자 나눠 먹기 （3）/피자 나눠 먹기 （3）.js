function solution(slice, n) {
   let result = Math.floor(n / slice);

    if (n % slice > 0){
        result += 1;
    }
    return result;
}