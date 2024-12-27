class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        
        int n = arr.length;
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int sum = arr[i];
            if(sum==target){
               res.add(i+1);
               res.add(i+1);
               break;
            }
             //System.out.println(sum);
            for(int j=i+1;j<n;j++ ){
                sum +=arr[j];
                //System.out.println(sum);
                if(sum == target){
                   // System.out.println(sum);
                    res.add(i+1);
                    res.add(j+1);
                }
                
                }
                if(!res.isEmpty()){
                    break;
                }
        }
         if(res.isEmpty()){
            res.add(-1);
            }
        return res;
        
    }
}
