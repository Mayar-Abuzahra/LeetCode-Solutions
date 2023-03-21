/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
       let reverse_num=parseFloat(
          x
            .toString()
            .split('')
            .reverse()
            .join('')
        )
      return (reverse_num == x.toString());
};
