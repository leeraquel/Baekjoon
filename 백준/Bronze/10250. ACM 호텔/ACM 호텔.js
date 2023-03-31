let input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

function checkIn(Height, Number){
  const H = parseInt(Height)
  let N = parseInt(Number)
  let W = 0
  while (N > 0) {
     N -= H
      W++
  }
  N += H
  console.log(N+"" + (W<10 ? "0" + W : W))
}

for(i= 1; i <= input[0]; i++){
    const Case = input[i].split(' ').map(ele=>parseInt(ele));
    checkIn(Case[0], Case[2])
}