function solution(array, n) {
    let arr = [];
    for(let i = 0; i < array.length; i++){
        let el = n - array[i];
        arr.push(el); 
    }
    
    let min = 100;
    let minIndex = 0;  
    for(let j = 0; j < arr.length; j++){
        let a = Math.abs(arr[j]);
        arr[j] = a;
        if(arr[j] < min || (arr[j] === min && array[j] < array[minIndex])){
            min = arr[j];
            minIndex = j; 
        }
    }
    
    return array[minIndex];  // result → minIndex
}