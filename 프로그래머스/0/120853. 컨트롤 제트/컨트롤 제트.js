function solution(s) {
    let stack = [];
    const arr = s.split(" ");
    for(let el of arr){
        if(el === "Z"){
            if(stack.length !== 0){
                stack.pop();
                continue;
            }
        }
        stack.push(parseInt(el));
        
    }
    
    return stack.reduce((acc, cur) => acc + cur, 0);
}