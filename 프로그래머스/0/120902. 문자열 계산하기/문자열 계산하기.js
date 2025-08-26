function solution(my_string) {
    let a = 0; // 플러스 담기
    let b = 0; // 마이너스 담기 
    let my_string2 = my_string.split(" ");
    
    for(let i = 0; i < my_string2.length; i++){
        if(i === 0){
            a += parseInt(my_string2[i]);
            continue
        }
        
        if(parseInt(my_string2[i])){ // 만일 숫자라면
            if((my_string2[i-1]) === "-"){
                b += parseInt(my_string2[i]);
            } else if((my_string2[i-1]) === "+") {
                a += parseInt(my_string2[i]);
            }
        }else{
            continue // 기호라면 넘어가겠다.
        }
    }
       return a-b;
}