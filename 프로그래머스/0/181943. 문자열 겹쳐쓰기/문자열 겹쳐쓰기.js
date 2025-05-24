function solution(my_string, overwrite_string, s) {
    var answer = '';
   // console.log(my_string.slice(0, s));
    let newStr = my_string.slice(0, s);
    
    newStr += overwrite_string;
    
    
    if(newStr.length < my_string.length){
        let newStr2 = my_string.slice(newStr.length);
        newStr += newStr2
    }
    return newStr;
    
    
}