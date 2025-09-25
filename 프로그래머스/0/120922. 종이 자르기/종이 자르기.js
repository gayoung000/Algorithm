function solution(M, N) {
    let cuts = 0;
    cuts += M - 1;
    cuts += (N - 1) * M;

    return cuts;
}
