function solution(my_string, n) {
    return my_string.split("").map((a) => a.repeat(n)).join("");
}