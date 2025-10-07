function solution(score) {
  const averages = score.map(([eng, math]) => (eng + math) / 2);
  const sorted = [...averages].sort((a, b) => b - a);

  // 점수별 랭크를 기록해두기
  const rankMap = new Map();
  sorted.forEach((avg, idx) => {
    if (!rankMap.has(avg)) {
      rankMap.set(avg, idx + 1);
    }
  });

  return averages.map(avg => rankMap.get(avg));
}