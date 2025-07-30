function solution(my_string) {
     const numbers = my_string.match(/\d+/g);
    
    if (!numbers) return 0;

    return numbers.reduce((acc, curr) => acc + parseInt(curr), 0);
   
}