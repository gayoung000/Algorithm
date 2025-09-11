function solution(id_pw, db) {
    
    for(let info of [...db]){
        if(id_pw[0] == info[0] && id_pw[1] == info[1]) return "login";
        if(id_pw[0] === info[0] && id_pw[1] !== info[1]) return "wrong pw"; 
    }
    
    return "fail";
}