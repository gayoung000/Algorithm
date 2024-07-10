function solution(numbers, num1, num2) {
    // let answer = [];
    // answer = [...numbers];
    // answer = answer.splice(num1, num2);
    // return answer;
    
    // let answer = [];
    // if(num1 >= 0 && num2 > num1){
    //     answer = numbers.splice(num1, num2);
    // } else if (num1 == num2){
    //     answer = numbers[0];
    // }
    // return answer;
    
    let answer = [];
    answer = [...numbers];
    let result = answer.slice(num1, num2+1);
    return result

}