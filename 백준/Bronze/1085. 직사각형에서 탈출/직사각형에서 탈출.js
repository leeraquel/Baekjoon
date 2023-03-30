let input = require('fs').readFileSync('/dev/stdin').toString().split(' ');
let X = parseInt(input[0])
let Y = parseInt(input[1])
let W = parseInt(input[2])
let H = parseInt(input[3])

let result = Math.min(X,Y,W-X,H-Y)
console.log(result)
