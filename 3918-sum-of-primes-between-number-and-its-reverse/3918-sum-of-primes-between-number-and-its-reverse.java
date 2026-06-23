class Solution {
    public boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int temp=n;
        int rev=0;
        while(temp!=0){
            int d=temp%10;
            rev=(rev*10)+d;
            temp/=10;
        }
        if(rev<n){
            temp=rev;
            rev=n;
            n=temp;
        }
        int sum=0;
        for(int i=n;i<=rev;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
}