function solution(numbers) {
    let content = [...numbers];
    const alphabet = {
        "zero": 0,
        "one": 1,
        "two": 2,
        "three": 3,
        "four": 4,
        "five": 5,
        "six": 6,
        "seven": 7,
        "eight": 8,
        "nine": 9
    };
    
    for(let el in alphabet){
        if(numbers.includes(el)){
            let num = content.join("").indexOf(el);
             while (num !== -1) {
                content.splice(num, el.length, alphabet[el]);
                num = content.join("").indexOf(el); 
             }
        } 
    }
    return Number(content.join(""));
}