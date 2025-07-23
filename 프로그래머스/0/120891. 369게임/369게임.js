function solution(order) {
    const result = order.toString().match(/[369]/g);
    let answer = 0;
    return result == null ? answer = 0 : answer = result.length;
    
}