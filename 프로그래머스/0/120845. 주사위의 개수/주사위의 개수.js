function solution(box, n) {
    let result = [];
    for (let i = 0; i < 3; i++) {
        result.push(~~(box[i]/n))
    }
    return result[0] * result[1] * result[2]
}