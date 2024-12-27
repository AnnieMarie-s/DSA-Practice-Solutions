class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        s = s.trim();
        String[] st = s.split(" ");
        int n = st.length;
        String sr = new String("");
        
        if(n==1){
            return s.trim();
        }
        for(int i =0; i<n ;i++ ){
            
            if(!st[n-i-1].trim().isEmpty()){
               sr += " " + st[n-i-1]; 
            }
        }
        return sr.trim();
    }
}
