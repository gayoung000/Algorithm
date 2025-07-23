function solution(my_string) {
    return my_string.split('').map((str) => parseInt(str)).filter(a => !Number.isNaN(a)).sort();
}