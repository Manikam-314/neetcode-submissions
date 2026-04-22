class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map=new HashMap<>();

        for(String word:strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);

            map.putIfAbsent(str,new ArrayList<>());
            map.get(str).add(word);
        }
            return new ArrayList<>(map.values());
    }
}
