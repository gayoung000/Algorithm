function solution(money) {
    let num = 0;
    let changes = 0;
    
    if (money >= 5,500){
        num = Math.trunc(money / 5500);
        changes = money - (5500 * num);
    }
    
    return [num, changes];
}