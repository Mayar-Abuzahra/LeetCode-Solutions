/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    //using Greedy algorithm
    let min_stock_in_prices = prices[0] 
    let max_profit = 0
    for(let i=1; i<prices.length; i++){
      if(prices[i] < min_stock_in_prices)
        min_stock_in_prices = prices[i]
      else
        max_profit = Math.max(max_profit, prices[i]-min_stock_in_prices)
    }
    return max_profit
};