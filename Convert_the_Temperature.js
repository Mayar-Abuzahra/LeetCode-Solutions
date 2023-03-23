/**
 * @param {number} celsius
 * @return {number[]}
 */
var convertTemperature = function(celsius) {
    let ans=[]
    ans[0]=(celsius+273.15)
    ans[1]=(celsius)* 1.80 + 32.00
    return ans
};