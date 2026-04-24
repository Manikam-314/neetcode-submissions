class Solution {
    public String minWindow(String s, String t) {
     int[] freq=new int[128];

     for(char ch:t.toCharArray()){
        freq[ch]++;
     }   
    int right=0;
    int left=0;
    int count=t.length();
        int min = Integer.MAX_VALUE;
        int start = 0;
     while(right<s.length()){
        char c=s.charAt(right);
        if(freq[c]>0){
            count--;
        }
        freq[c]--;
        right++;
        
        while(count==0){
            if(right-left<min){
                min=right-left;
                start=left;
            }
            char cl=s.charAt(left);
            freq[cl]++;

            if(freq[cl]>0){
                count++;
            }
            left++;
        }
     }
             return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);

    }
}
