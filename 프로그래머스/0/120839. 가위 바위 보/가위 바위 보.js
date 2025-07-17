function solution(rsp) {
    let map = new Map();
    map.set("2", "0");
    map.set("0", "5");
    map.set("5", "2");
    

    return rsp.split("").map((n) => map.get(n)).join("");
}