//f(n) = f(n-1) + f(n-2)
class Solution {
    public int climbStairs(int n) {
        int [] fq = new int [n+1];
        fq[0] = 1;
        fq[1] = 1;
        for(int i = 2; i <= n; i++) {
            fq[i] = fq[i-1] + fq[i-2];
        }
        return fq[n];
    }
}
