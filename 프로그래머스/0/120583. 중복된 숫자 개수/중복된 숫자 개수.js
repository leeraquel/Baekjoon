function solution(array, n) {
    var answer = 0;
    answer = array.filter((x) => x === n).length
    return answer;
}