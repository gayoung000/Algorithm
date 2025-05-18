function solution(arr, queries) {
    let arr2 = [...arr];
    
    for(let i = 0; i < queries.length; i++){
        let query = queries[i];
        
        let s = query[0];
        let e = query[1];
        let k = query[2];
        
        for(let i = s; i <= e; i++){
            if(i % k == 0) {
                arr2[i] = arr2[i] + 1;
            }
        }
    }
  return arr2;
}