function solution(spell, dic) {
    const target = new Set(spell);

    for (let el of dic) {
        const wordSet = new Set(el);
        if (wordSet.size === target.size && [...target].every(ch => wordSet.has(ch))) {
            return 1;
        }
    }
    return 2;
}