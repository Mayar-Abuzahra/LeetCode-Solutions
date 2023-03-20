/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
var divide = function(dividend, divisor) {
    let x = parseInt(dividend/divisor)
    if(x == Math.pow(2, 31))
      return Math.pow(2, 31) - 1
    return x
};