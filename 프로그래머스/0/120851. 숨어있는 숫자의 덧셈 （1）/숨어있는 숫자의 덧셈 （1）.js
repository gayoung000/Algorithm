function solution(my_string) {
    return my_string.match(/[0-9]/g).map((a) => parseInt(a)).reduce((a,b) => a+b);
}
