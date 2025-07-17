function solution(rsp) {
    let map = new Map();
    map.set("2", "0");
    map.set("0", "5");
    map.set("5", "2");
    
    let arr = rsp.split("");
    let result = "";
    for(let num of arr){
        result += map.get(num);
    }
    
    return result;
}