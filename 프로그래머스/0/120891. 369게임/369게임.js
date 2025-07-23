function solution(order) {
    const result = order.toString().match(/[369]/g);
    let answer = 0;
    result == null ? answer = 0 : answer = result.length;
    
    return answer
}