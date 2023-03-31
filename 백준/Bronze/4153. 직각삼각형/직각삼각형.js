let input = require('fs').readFileSync('/dev/stdin').toString().split('\n').map((arg) => arg.split(" ").map(Number));

function check(input){
  for(let i=0; i< input.length -1; i++){
    input[i].sort((a,b) => a - b);
    [a, b, c] = input[i];
    if(a === 0 || b === 0 || c === 0) {
      return
    }
    else {a ** 2 + b ** 2 === c ** 2 ? console.log('right') : console.log('wrong')
    }
}

}

check(input);