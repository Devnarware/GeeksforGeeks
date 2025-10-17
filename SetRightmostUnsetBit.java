class Solution {
    static int setBit(int n) {
        // code here
        int m = n ;
        int count = 0 ;
        while(m>0){
            if((m&1) == 0){
                break ;
            }
            count++ ;
            m = m>>1 ;
        }
        return ((1<<count) | n ) ;
    }
}
