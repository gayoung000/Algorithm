function solution(n) {
    const set = new Set();
    let i = 2;
    
    while (i <= Math.floor(Math.abs(n))) {
        if(n % i === 0){
            set.add(i); 
            n = n / i;
        } else {
            i++
        }
    }
        
    return Array.from(set);
    
}