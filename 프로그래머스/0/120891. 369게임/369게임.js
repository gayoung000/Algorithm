function solution(order) {
    const result = order.toString().match(/[369]/g);
    return result ? result.length : 0;
}