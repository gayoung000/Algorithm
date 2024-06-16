function solution(array, n) {
    let count = 0
    
    if ( array.includes(n) ){
        for ( let item of array ){
            if (item == n){
                count += 1;
            } else {
                count += 0;
            }
        }
    } else {
        count = 0;
    } return count;
}