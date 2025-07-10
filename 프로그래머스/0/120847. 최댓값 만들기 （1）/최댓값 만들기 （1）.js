function solution(numbers) {
    let array = numbers.sort((a,b) => a - b)
    console.log(array);
    const length = array.length;
    return array[length - 1] * array[length - 2]; 
}