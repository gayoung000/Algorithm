function solution(s) {
    if(s.length == 4 || s.length == 6){
        if(s.match(/[A-Z]/gi) == null){
            return true;
        }else {
            return false;
        }
        
    } else {
        return false;
    }
}