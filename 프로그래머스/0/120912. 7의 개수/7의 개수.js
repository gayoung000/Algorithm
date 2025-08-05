function solution(array) {
    
    let num = 0;
    array.forEach((a) => {
                    let matches = a.toString().match(/7/g);
                    if(matches){ 
                        num += matches.length;
                    }
    }
    );
    
    
    return num;
}