class Solution {

    // temp: input array
    // n: size of array
    // Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[]) {

        // Your code here
        int n= arr.length;

for(int i = 0; i<n;i++){
           int j =i;
           int k = n;
           int count =0;
           int min =(n-i)/2;
           while( count < min){
              int temp = arr[k-1];
               arr[k-1] = arr[j];
               arr[j]=temp;
               j++;
               k--;
               count++;
           }
}

        
    }
}
