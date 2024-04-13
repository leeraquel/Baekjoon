function solution(array) {
    var answer = 0;
    const sorted = array.sort((a,b)=> a - b);
    centerN = parseInt(array.length / 2)
    answer = sorted[centerN]
    return answer;
}