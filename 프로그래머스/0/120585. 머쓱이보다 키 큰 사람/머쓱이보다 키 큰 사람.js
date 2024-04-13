function solution(array, height) {
    var answer = 0;
    const sortedArray = array.sort();
    answer = sortedArray.filter((x)=> x > height)
    return answer.length;
}