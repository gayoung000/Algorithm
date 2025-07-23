function solution(numbers, direction) {
   if(direction == "left"){
       const num = numbers.shift();
       console.log(num);
       numbers.push(num);
   } else {
       const num = numbers.pop();
       console.log(num);
       numbers.unshift(num);
   }
    
    return numbers;
}