function solution(balls, share) {
    
    function factorial(num) {
    if (num === 0 || num === 1) {
        return 1;
    }
    return num * factorial(num - 1);
}
    
    function combination(n, m) {
    if (m > n) {
        return 0; 
    }
    return Math.round(factorial(n) / (factorial(n - m) * factorial(m)));
}   
    return combination(balls,share) 
}



