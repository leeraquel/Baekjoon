
let input = require('fs').readFileSync('/dev/stdin').toString()

function factorial(input){
  input = parseInt(input)
  if(input === 0){
    return 1
  }
  else if(input <= 2){
    return input
  }
  return input * factorial(input - 1)
}

console.log(factorial(input))