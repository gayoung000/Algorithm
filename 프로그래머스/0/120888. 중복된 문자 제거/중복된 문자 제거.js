function solution(my_string) {
    let double = [];
    
    for(let i = 0; i < my_string.length; i++) {
        if(double.includes(my_string[i])){
           continue;
        } else {
            double.push(my_string[i]);
        }
    
    }
    console.log(double);
 return double.join('');
}