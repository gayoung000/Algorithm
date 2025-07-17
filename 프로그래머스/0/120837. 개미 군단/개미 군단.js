function solution(hp) {
    const jang = 5;
    const beong = 3; 
    const el = 1;
    let result = 0;
    
    result += Math.floor(hp/jang);
    hp = hp - Math.floor(hp/jang)*5;
    
    if(hp % jang > 0){
       result += Math.trunc(hp/beong);
        hp = hp - Math.trunc(hp/beong)*3;
        if(hp % beong > 0){
           result += Math.trunc(hp/el); 
        }
    }
    
    return result;
}