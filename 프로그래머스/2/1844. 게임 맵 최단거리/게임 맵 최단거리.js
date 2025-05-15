function solution(maps) {
    const n = maps.length;
    const m = maps[0].length;
    
    const dx = [-1, 1, 0, 0];
    const dy = [0, 0, -1, 1];
    
    
    const visited = Array.from({length: n}, () => Array(m).fill(false));
    visited[0][0] = true;
    
    const queue = [[0, 0]];
    let head = 0;
    
    while(head < queue.length){
         const [x, y] = queue[head++];
        
        for(let i = 0; i < 4; i++){
            const nx = x + dx[i];
            const ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < n && ny < m){
                if(!visited[nx][ny] && maps[nx][ny] === 1){
                    queue.push([nx, ny]);
                    visited[nx][ny] = true;
                     maps[nx][ny] = maps[x][y] + 1;
                }
            }
            
        }
    }
    
    const answer = maps[n-1][m-1];
    return answer === 1 ? -1 : answer;
    
    
    
}