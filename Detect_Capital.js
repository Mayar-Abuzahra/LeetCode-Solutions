/**
 * @param {string} word
 * @return {boolean}
 */
function detectCapitalUse(word) {
  let counterUppercaseLetters = 0;
  
  for (let i = 0; i < word.length; i++) {
    if (word[i] === word[i].toUpperCase()) {
      counterUppercaseLetters++;
    }
  }
  
  return counterUppercaseLetters === 0 ||
         counterUppercaseLetters === word.length ||
         (counterUppercaseLetters === 1 && word[0] === word[0].toUpperCase());
}