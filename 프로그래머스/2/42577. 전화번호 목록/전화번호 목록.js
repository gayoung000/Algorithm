function solution(phone_book) {
    // 정규표현식 vs 해시
    phone_book.sort();
    let set = new Set(phone_book);
    
    
    for (let s of set) {
       for(let i = 1; i < s.length; i++){
           const prefix = s.slice(0, i);
           if(set.has(prefix)){
               return false
           }
       }
    }
    
    return true;

}