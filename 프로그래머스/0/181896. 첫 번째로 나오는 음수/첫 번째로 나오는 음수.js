function solution(num_list) {
    const num = num_list.length;
   
    for(let i = 0; i < num; i++){
        if(num_list[i] < 0){
            return i;
        }
    }
    
    return -1;

}