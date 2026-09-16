class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
            
        int org = x;
        int rev = 0;

        for(int i=x; i != 0; i = i/10){
            rev = rev * 10 + i%10;
        }

        if(org == rev)
           return true;
        
        else
            return false;
    }
}