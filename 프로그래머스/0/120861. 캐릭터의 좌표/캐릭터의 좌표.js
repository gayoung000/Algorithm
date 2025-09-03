function solution(keyinput, board) {
    let x = 0;
    let y = 0;
    let maxX = Math.floor(board[0] / 2);
    let maxY = Math.floor(board[1] / 2);
    
    for(let key of keyinput){
        if(key === "left") x--;
        if(key === "right") x++;
        if(key === "up") y++;
        if(key === "down") y--;
        
        if (x > maxX) x = maxX;
        if (x < -maxX) x = -maxX;
        if (y > maxY) y = maxY;
        if (y < -maxY) y = -maxY;
    }
    
    return [x,y];
}