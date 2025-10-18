// class Solution {
//     static int max(int[] arr, int n){
//         int max = n ;
//         for(int i = n ; i<arr.length ; i++ ){
//             if(arr[max]<arr[i]){
//                 max = i ;
//             }
//         }
//         return max ;
//     }
//     static ArrayList<Integer> leaders(int arr[]) {
//         ArrayList<Integer> list = new ArrayList<>() ;
//         int count = 0 ;
//         while(count<arr.length-1){
//             int i = max(arr, count) ;
//             list.add(arr[i]) ;
//             count = i+1 ;
//         }
//         if (count<arr.length){
//             list.add(arr[arr.length-1]) ;
//         }
//         return list ;
//     }
// }

//UPDATED VERSION


class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>() ;
        list.add(arr[arr.length-1]) ;
        int max = arr[arr.length-1] ;
        for(int i = arr.length-2 ; i>=0 ;i--){
            if(arr[i]>=max){
                list.add(arr[i]) ;
                max = arr[i] ;
            }
        }
        Collections.reverse(list);
        return list ;
    }
}

