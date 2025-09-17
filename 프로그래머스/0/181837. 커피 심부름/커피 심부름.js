function solution(order) {
    let total = 0;

    for (let menu of order) {
        if (menu.includes("americano") || menu === "anything") {
            total += 4500;
        } else if (menu.includes("cafelatte")) {
            total += 5000;
        }
    }

    return total;
}