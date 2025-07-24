function solution(phone_book) {
    // 정규표현식 vs 해시
    phone_book.sort();

    for (let i = 0; i < phone_book.length - 1; i++) {
        if (phone_book[i + 1].startsWith(phone_book[i])) {
          return false;
        }
    }
    
    return true;

}