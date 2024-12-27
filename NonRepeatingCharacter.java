class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        int n = s.length();
        int flag = 0;
        char res = '1';
        char[] arr = s.toCharArray();
        for(int i =0; i<n;i++){
            if(s.indexOf(arr[i]) == s.lastIndexOf(arr[i])){
                flag=1;
                res = arr[i];
                break;
                
            }
        }
        if(flag!=0){
            return res;
            
        }
        return '$';
        
    }
}

