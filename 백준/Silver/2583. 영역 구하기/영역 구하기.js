const input = require("fs")
  .readFileSync(0, "utf8")
  .toString()
  .trim()
  .split("\n");

const [M, N, K] = input[0].split(" ").map(Number);
const rects = input.slice(1).map((line) => line.split(" ").map(Number));

// M, N 만큼의 그리드 만들기
const grid = Array.from({ length: M }, () => Array(N).fill(0));

// 직사각형 채우기
for (const [x1, y1, x2, y2] of rects) {
  for (let y = y1; y < y2; y++) {
    for (let x = x1; x < x2; x++) {
      grid[y][x] = 1;
    }
  }
}

//
const visited = Array.from({ length: M }, () => Array(N).fill(false));
const dr = [1, -1, 0, 0];
const dc = [0, 0, 1, -1];

function bfs(startY, startX) {
  let count = 0;
  const queue = [[startY, startX]];
  let head = 0;
  visited[startY][startX] = true;

  while (head < queue.length) {
    const [y, x] = queue[head++];
    count++;

    for (let i = 0; i < 4; i++) {
      const nr = y + dr[i];
      const nc = x + dc[i];

      if (nr < 0 || nr >= M || nc < 0 || nc >= N) continue;
      if (visited[nr][nc] || grid[nr][nc] !== 0) continue;

      visited[nr][nc] = true;
      queue.push([nr, nc]);
    }
  }
  return count;
}

const areas = [];
for (let y = 0; y < M; y++) {
  for (let x = 0; x < N; x++) {
    if (grid[y][x] === 0 && !visited[y][x]) {
      areas.push(bfs(y, x));
    }
  }
}

areas.sort((a, b) => a - b);
console.log(areas.length);
console.log(areas.join(" "));
