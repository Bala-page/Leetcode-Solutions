class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new TreeMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}