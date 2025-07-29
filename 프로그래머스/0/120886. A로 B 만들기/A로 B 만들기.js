function solution(before, after) {
    let arr = after.split("");
    for (b of before){
        if(arr.includes(b)){
            let index = arr.indexOf(b);
            arr[index] = -1;
        } else {
        return 0;
        }
    } 
    
    return 1;
}