/**
 * @param {number[]} arr
 * @param {number[][]} queries
 * @return {number[]}
 */
var xorQueries = function(arr, queries) {
  let result_list=[], left=0, right=0, sum=0
  for(let i=0; i<queries.length; i++){
    left=queries[i][0]
    right=queries[i][1]
    while(left<=right){
      sum^=arr[left]
      left++;
    }
    result_list.push(sum)
    sum=0
  }
  return result_list;  
};