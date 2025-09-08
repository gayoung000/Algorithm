function solution(spell, dic) {
    let result = 0;
    let target = spell.sort().join("");
    
    for(let el of dic){
        let letter = el.split("").sort().join("");
        if(letter === target){
            result++;
        }
    }
    
    return result == 0 ? 2 : 1
}