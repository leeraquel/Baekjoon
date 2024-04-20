function solution(dot) {
    var answer = 0;
    [num1, num2] = dot;

    return (num1 * num2 < 0 ) ? (num1 > 0 ? 4 : 2) : (num1 < 0 ? 3 : 1)

}