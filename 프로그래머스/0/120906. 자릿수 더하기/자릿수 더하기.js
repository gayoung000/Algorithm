function solution(n) {
    const a = String(n).split("");
    let result = 0;
    for(let i=0; i < a.length; i++){
        result += parseInt(a[i]);
    }
    return result;
}