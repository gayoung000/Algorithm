function solution(n, computers) {
    // 우선 연결 여부를 따지는 것일까 군집 개수를 따지는 것일까
    // 그래프 유형이지만, 군집 여부를 따지는 것. 
    // computers 돌면서 연결 요소 갯수 세기 
    let visited = Array.from({length : n}, () => false);
    let count = 0;  
    
    function dfs(node){
        visited[node] = true;
        for(let j = 0; j < n; j++){
            if(!visited[j] && computers[node][j] === 1){
                dfs(j);
            }
        }
    }
    
    for(let i = 0; i < n; i++){
        if(!visited[i]){
            count++;
            dfs(i);
        }

    }
    
    return count;
}