function solution(i, j, k) {
    let result = 0;
    for(let l = i; l <= j; l++){
        let arr = l.toString();
        for(let a = 0; a < arr.length; a++){
            arr[a] === k.toString() ? result++ : 0;
        }
    }
    return result;
}