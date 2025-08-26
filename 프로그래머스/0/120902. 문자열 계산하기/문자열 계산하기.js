function solution(my_string) {
    let arr = my_string.split(" ");
    let result = +arr[0];
    
    for(let i = 1; i < arr.length; i += 2){
        if(arr[i] === "+"){
            result += +arr[i+1];
        } else if(arr[i] === "-"){
            result += -arr[i+1];
        }
    }
        
    return result;
}