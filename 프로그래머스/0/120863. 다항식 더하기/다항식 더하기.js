function solution(polynomial) {
   const terms = polynomial.split(" + ");
    let xSum = 0;  // x 계수 합
    let numSum = 0; // 상수 합

    for (let term of terms) {
        if (term.includes("x")) {
            // 계수가 생략된 경우 (ex: "x")
            const coeff = term === "x" ? 1 : parseInt(term.replace("x", ""));
            xSum += coeff;
        } else {
            numSum += parseInt(term);
        }
    }

    let result = [];
    if (xSum > 0) {
        result.push(xSum === 1 ? "x" : `${xSum}x`);
    }
    if (numSum > 0) {
        result.push(numSum);
    }

    return result.join(" + "); 
}