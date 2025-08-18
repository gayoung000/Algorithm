function solution(balls, share) {
    if (share < 0 || share > balls) return 0;
    let n = balls, k = share;

    let res = 1n;
    for (let i = 1n; i <= k; i++) {
        res = (res * (BigInt(n) - BigInt(k) + i)) / i;
    }
    return Number(res);
}