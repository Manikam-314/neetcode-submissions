class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> list=new ArrayList<>();

        for(int num:nums){
            list.add(num);
        }
        for(int num:nums){
            list.add(num);
        }
        int[] arr=new int[list.size()];

        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}