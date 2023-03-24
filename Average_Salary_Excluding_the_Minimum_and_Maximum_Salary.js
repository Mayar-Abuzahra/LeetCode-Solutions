/**
 * @param {number[]} salary
 * @return {number}
 */
var average = function(salary) {
  let total   =  salary.reduce(function (curr, prev) { 
    return curr + prev; 
  });
  return (total-Math.min(...salary)-Math.max(...salary))/((salary.length)-2)
};