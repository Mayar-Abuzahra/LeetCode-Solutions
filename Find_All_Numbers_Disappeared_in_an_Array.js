/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
   let num_point=1, disappeared_list=[]
   while(num_point<=nums.length){
     if(!nums.includes(num_point))
      disappeared_list.push(num_point)
     num_point++
   } 
   return disappeared_list
};