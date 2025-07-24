function solution(arr)
{
    let stack = [];
    for(let n of arr){
        if(stack.length === 0){
            stack.push(n);
            continue;
        }
        
        let pop = stack.pop();
        if (n !== pop){
            stack.push(pop);
            stack.push(n);
        } else {
            stack.push(pop);
        }
    }
    
    return stack;
}