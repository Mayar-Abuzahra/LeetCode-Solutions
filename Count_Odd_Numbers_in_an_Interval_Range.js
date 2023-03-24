/**
 * @param {number} low
 * @param {number} high
 * @return {number}
 */
var countOdds = function(low, high) {
  let count=0
    while(low<=high){
      if(low%2 !== 0)
       count++
      low++
    }
    return count
};