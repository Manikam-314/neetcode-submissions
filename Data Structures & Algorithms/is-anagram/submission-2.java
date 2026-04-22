class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        char[] ch= s.toCharArray();
        char[] ch2=t.toCharArray();

        Map<Character,Integer> map=new HashMap<>();

        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c:ch2){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.get(c)-1);

            if(map.get(c)==0){
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
