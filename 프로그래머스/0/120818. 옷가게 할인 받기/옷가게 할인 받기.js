function solution(price) {
     
    if ( price >= 100000 && price < 300000){
        price = price - (price * 0.05);
    } else if ( price >= 300000 && price < 500000){
        price = price - (price * 0.1);
    } else if (price >= 500000){
        price = price - (price * 0.2);
    }
    
    price = parseInt(price);
    return price;
}