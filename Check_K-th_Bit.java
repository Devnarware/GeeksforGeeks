class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        if(((n>>k)&1) == 1){
            return true ;
        }
        return false ;
    }
}
