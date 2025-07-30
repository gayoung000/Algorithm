function solution(s) {
    let newS = s.split("");
    newS.sort();
    
    let result = "";
    
    for(let el of newS){
        let count = 0;
        for(let i = 0; i < newS.length; i++){
            if(el === newS[i]){
                count++;
            }
        }
        
        if(count >= 2){
            continue;
        } else {
            result += el;
        }
    }
    
    return result;
    
    
}