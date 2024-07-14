function solution(my_string) {
    const vowel = ['a', 'e', 'i', 'o', 'u'];
    
    let new_string = my_string;
    
    for(let i = 0; i < new_string.length; i++){
        if(vowel.includes(new_string[i])){
            new_string = new_string.slice(0, i) + new_string.slice(i + 1);
            i--;
        } 
    }
    return new_string;
}