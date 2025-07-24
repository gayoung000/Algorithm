function solution(s){
    let stack = [];
    
    if(s.startsWith(')'))
        return false;
    
    for(let el of s){
        if(stack.length == 0){
            stack.push(el);
            console.log(stack);
            continue;
        }
        
        let pop = stack.pop();
        if(pop === '(' && el === '(' || pop === ')' && el === ')' || pop.startsWith(')')){
            stack.push(pop);
            stack.push(el);
        } 
    }
    
    return stack.length == 0 ? true : false;
}