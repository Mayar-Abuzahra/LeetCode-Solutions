/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let temp_string = s.split(" ")
    temp_string = temp_string.filter(elements => {
      return elements !== '';
    });
    return temp_string[temp_string.length-1].length
};