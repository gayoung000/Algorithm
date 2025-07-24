function solution(nums) {
    let map = new Map();
    const halfSize = nums.length / 2;
    
    for(const num of nums){
        map.set(num, (map.get(num) || 0) + 1)
    }
    
    return map.size >= halfSize ? halfSize : map.size; 
}