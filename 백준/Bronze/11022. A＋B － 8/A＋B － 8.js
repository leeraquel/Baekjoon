let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const count = Number(input[0]);
for(let i=1; i<=count; i++) {
    let numbers = input[i].split(' ');
    console.log(`Case #${i}: ${numbers[0]} + ${numbers[1]} = ${Number(numbers[0]) + Number(numbers[1])}`);
}