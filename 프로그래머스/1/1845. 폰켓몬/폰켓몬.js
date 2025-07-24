function solution(nums) {
    const set = new Set();  
    const halfSize = nums.length / 2;
    
    for(const num of nums){
        set.add(num)
    }
    
    return set.size >= halfSize ? halfSize : set.size; 
}