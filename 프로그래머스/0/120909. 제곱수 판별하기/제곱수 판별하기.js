function solution(n) {
    let a = Math.sqrt(n);       // n의 제곱근 구하기
    return a == Math.floor(a) ? 1 : 2;
}