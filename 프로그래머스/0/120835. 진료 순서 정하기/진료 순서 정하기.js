function solution(emergency) {
    var answer = [];
    const sortedArray = [...emergency].sort((a,b) => b-a)
    for (let i = 0; i < emergency.length; i++) {
        answer.push(sortedArray.indexOf(emergency[i])+1)
    }
    return answer
}