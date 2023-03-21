class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if len(s) == 1:
            return s

        longest_palindrome = s[0]

        # Iterate through all possible substrings
        for i in range(len(s)):
            # Check suffixes of reversed string for palindromes
            for j in range(len(s), i, -1):
                substring = s[i:j]
                if substring == substring[::-1]:
                    # Update longest palindrome found so far
                    if len(substring) > len(longest_palindrome):
                        longest_palindrome = substring
                    # Break out of loop early if maximum length is reached
                    if len(longest_palindrome) == len(s):
                        return longest_palindrome

        return longest_palindrome
