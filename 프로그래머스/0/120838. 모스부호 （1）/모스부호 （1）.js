function solution(letter) {
    morse = { 
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
}
    const letterArray = letter.split(' ')
    let result = []
    for (let i = 0; i < letterArray.length; i++) {
        Object.keys(morse).map((str)=> {
            if(str === letterArray[i]) {
                result.push(morse[str])
            }
            
        })
    }
    return result.join('');
}