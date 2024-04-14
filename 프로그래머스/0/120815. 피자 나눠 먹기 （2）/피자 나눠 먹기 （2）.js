function solution(n) {
    var answer = 0;
    function gcd(a, b) {
     if (b === 0) return a;
      return gcd(b, a % b);
    }
    
    if(n < 6) {
        answer = (n / gcd(6,n))
    } else { 
        answer = (n / gcd(n,6))}
    
    return answer;
}