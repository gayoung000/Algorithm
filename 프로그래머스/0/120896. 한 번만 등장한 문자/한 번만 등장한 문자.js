function solution(s) {
    let maps = new Map();
    
    for(let el of s){
        maps.get(el) > 0 ? maps.set(el, maps.get(el) + 1) : maps.set(el, 1) 
    }
    
    let filterArr = [...maps.keys()].filter((a) => maps.get(a)=== 1);
    return filterArr.sort().join('');
}