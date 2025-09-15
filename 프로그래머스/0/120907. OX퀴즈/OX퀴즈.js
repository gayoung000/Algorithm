function solution(quiz) {
    return quiz.map(q => {
        let [x, op, y, , z] = q.split(" ");
        
        x = Number(x);
        y = Number(y);
        z = Number(z);
        
        let result = (op === "+") ? x + y : x - y;
        
        return result === z ? "O" : "X";
    });
}
