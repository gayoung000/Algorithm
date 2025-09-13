function solution(dots) {
    let xs = dots.map(dot => dot[0]);
    let ys = dots.map(dot => dot[1]);

    let minX = xs.reduce((a, b) => Math.min(a, b));
    let maxX = xs.reduce((a, b) => Math.max(a, b));
    let minY = ys.reduce((a, b) => Math.min(a, b));
    let maxY = ys.reduce((a, b) => Math.max(a, b));

    return (maxX - minX) * (maxY - minY);
}