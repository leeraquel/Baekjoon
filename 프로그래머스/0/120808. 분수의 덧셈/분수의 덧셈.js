function solution(numer1, denom1, numer2, denom2) {
  const numer = numer1 * denom2 + numer2 * denom1; 
  const denom = denom1 * denom2; 
  const getGcd = (a, b) => (a % b === 0 ? b : getGcd(b, a % b));
  const gcd = getGcd(numer, denom); 
  return [numer / gcd, denom / gcd]; 
}

// 유클리드 호제법 get Gcd를 이용하여 최대공약수 계산 후 약분하여 return