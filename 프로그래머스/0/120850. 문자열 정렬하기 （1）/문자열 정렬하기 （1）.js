function solution(my_string) {
    const arr = my_string.split('');
    const result = arr.map((str) => parseInt(str));
    const filter2 = result.filter(a => typeof(a) == "number")
    console.log(filter2);
    return my_string.split('').map((str) => parseInt(str)).filter(a => !Number.isNaN(a)).sort();
}