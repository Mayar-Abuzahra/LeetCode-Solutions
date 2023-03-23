/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function(flowerbed, n) {
  let n_step=0
  for(let i=0; i<flowerbed.length; i++){
    if(flowerbed[i]===0 && flowerbed[i-1]!==1 && flowerbed[i+1]!==1 && n_step!==n){
      flowerbed[i]=1
      n_step++
    }
    if(n_step===n)
     break
  }
  return (n_step===n)
};