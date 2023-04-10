public class Solution {
    public int CountPrimes(int n) {
      if(n <= 2) return 0;
      int count_primes = 1;
      for (int i = 3; i < n; i++) {
        if (IsPrime(i)) 
         count_primes++;
      }
      return count_primes;  
    }
    private static bool IsPrime(int n)
   {
      if (n <= 3) return n > 1;
      if (n % 2 == 0 || n % 3 == 0) return false;
      for (int i = 5; i * i <= n; i += 6) 
        if (n % i == 0 || n % (i + 2) == 0) return false;
      return true;
   }
}