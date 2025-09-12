function solution(dots) {
    let x = dots.map(dot => dot[0]);
    let y = dots.map(dot => dot[1]);
 
    let width = Math.max(...x) - Math.min(...x);
    let height = Math.max(...y) - Math.min(...y);

    return width * height;
}