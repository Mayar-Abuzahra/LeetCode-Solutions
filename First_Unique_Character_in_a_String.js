/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
  const noteCounts = {};
  for (let char of s) {
    noteCounts[char] = (noteCounts[char] || 0) + 1;
  }   
  for (let key in noteCounts) {
    if (noteCounts[key] === 1) {
      return s.indexOf(key);
    }
  }
  return -1;
};