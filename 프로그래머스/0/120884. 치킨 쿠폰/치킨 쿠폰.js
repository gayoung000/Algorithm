function solution(chicken) {
  let service = 0;
  let coupon = chicken;

  while (coupon >= 10) {
    const newChickens = Math.floor(coupon / 10); 
    service += newChickens;                   
    coupon = newChickens + (coupon % 10);        
  }

  return service;
}
