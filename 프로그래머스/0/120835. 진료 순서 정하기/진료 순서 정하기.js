function solution(emergency) {
    const emergencyOrigin = [...emergency];;
    emergency.sort((a,b ) => b-a);
    let arr = [];
    
    for(let eo of emergencyOrigin) {
        arr.push(emergency.indexOf(eo) + 1);
    }
    
    return arr;
}