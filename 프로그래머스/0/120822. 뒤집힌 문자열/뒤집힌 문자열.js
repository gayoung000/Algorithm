function solution(my_string) {
    let string = "";
    for(let i = my_string.length - 1; i >= 0; i--){
        string += my_string[i];
    }
    
    return string
}