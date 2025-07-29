function solution(num_list, n) {
    let result = [];
    for(let i = 0; i < num_list.length; n){
        result.push(num_list.splice(i, i+n));
    }
    
    return result;
}