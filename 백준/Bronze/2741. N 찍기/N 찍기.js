let input = require('fs').readFileSync('/dev/stdin').toString().split(' ');
let a = parseInt(input[0]);

let answer = '';
for (let i = 1; i <= a; i++) {
	answer += i + '\n'
}
console.log(answer);