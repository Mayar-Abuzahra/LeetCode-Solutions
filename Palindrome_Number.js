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
      if(reverse_num== x.toString())
        return true;
      return false;
};
