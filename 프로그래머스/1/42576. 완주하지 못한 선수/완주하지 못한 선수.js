function solution(participant, completion) {
    let map = new Map();

    for(let i = 0;  i < participant.length; i++){
       map.set(participant[i], (map.get(participant[i]) || 0) + 1); 
    }
    
    for (const name of completion){
        if (map.get(name)){
            map.set(name, (map.get(name) -1));
        }
    }
    
    
    for (const [key, value] of map){
        if(value >= 1){
            return key;
        }
    }
  

}