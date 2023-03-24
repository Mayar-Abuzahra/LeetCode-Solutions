/**
 * @param {string} s
 * @return {boolean}
 */
var isNumber = function(s) {
   return /^[+-]?(?:\d+\.?|\.\d+)\d*(?:[eE][+-]?\d+)?$/.test(s) 
};