/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */

var addBinary = function(a, b) {
let result = ""
let carry = 0
a = a.padStart(Math.max(a.length, b.length), "0")
b = b.padStart(Math.max(a.length, b.length), "0")

for(let i = a.length - 1; i >= 0; i--){
  if(a[i] === "1" && b[i] === "1"){
    result = carry + result
    carry = 1
  }
  else if(a[i] === "0" && b[i] === "0"){
    result = carry + result
    carry = 0
  }
  else{
    if(carry === 1){
      result = "0" + result
      carry = 1
    }
    else{
      result = "1" + result
      carry = 0
    }
  }
}

if(carry === 1){
  result = carry + result
}

return result
};
