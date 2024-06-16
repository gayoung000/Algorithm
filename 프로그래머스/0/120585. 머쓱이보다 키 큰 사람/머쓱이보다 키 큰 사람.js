function solution(array, height) {
    array = array.sort();
    let count = 0;
    array.forEach((num) => {
        if (num > height){
            count++;
        } else {
            count += 0;
        }
        return count
    });
    
    return count;
}