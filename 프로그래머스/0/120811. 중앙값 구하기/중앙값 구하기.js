function solution(array) {
    array.sort((a, b) => a-b);
    console.log(array);
    return array[Math.trunc(array.length / 2)];
}
