var longestCommonPrefix = function(strs) {
  let max_sub_string_prefix = "", j=0, k=strs.length - 1, flag=1;
  let minimum_string_length = strs.reduce(function(a, b) {
    return a.length <= b.length ? a : b;
  }).length;
  for(let i=1; i<=minimum_string_length; i++){
    if(strs[j].slice(0, i) === strs[k].slice(0, i)){
      while(j<k){
        j++;
        if(strs[j].slice(0, i) !== strs[k].slice(0, i)){
          flag = 0
          break;
        }
        k--;
      }
      if(flag !== 0)
        max_sub_string_prefix = strs[0].slice(0, i);
    } else {
      break;
    }
    j = 0;
    k = strs.length - 1;
  }
  return max_sub_string_prefix;
};