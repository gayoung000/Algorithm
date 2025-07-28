function solution(my_string, queries) {
    let arr = my_string.split('');  

    for (let q of queries) {
        let [start, end] = q;
        let target = arr.slice(start, end + 1); 
        let reversed = target.reverse();  

        arr.splice(start, end - start + 1, ...reversed);
    }
    
    return arr.join(''); 
}
