function solution(array, commands) {
    let result = [];
    for(c of commands){
        let sliceArr = array.slice(c[0]-1, c[1]);
        sliceArr.sort((a,b) => a-b);
        console.log(sliceArr)
        result.push(sliceArr[c[2]-1]);
    }
    
    return result;
}