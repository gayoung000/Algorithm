function solution(age) {
    const map = ['a','b','c','d','e','f','g','h','i','j'];
    
    return age.toString().split('').map((a) => map[a]).join('');
}