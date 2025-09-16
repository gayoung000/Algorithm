function solution(score) {
     let result = [];

    for (let i = 0; i < score.length; i++) {
        let [eng, math] = score[i];
        let avg = (eng + math) / 2;

        // 본인보다 평균이 높은 사람의 수를 센다
        let rank = 1;
        for (let j = 0; j < score.length; j++) {
            if (i !== j) {
                let [e, m] = score[j];
                let otherAvg = (e + m) / 2;
                if (otherAvg > avg) {
                    rank++;
                }
            }
        }

        result.push(rank);
    }

    return result;
}