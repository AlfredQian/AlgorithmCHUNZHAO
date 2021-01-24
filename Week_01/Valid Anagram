class Solution {
    public boolean isAnagram(String s, String t) {
//排序
        // if(s.length() != t.length()) {
        //     return false;
        // }
        // char[] str1 = s.toCharArray();
        // char[] str2 = t.toCharArray();
        // Arrays.sort(str1);
        // Arrays.sort(str2);
        // return Arrays.equals(str1,str2);

// Table 建立表，通过遍历两个字符串，比较字母出现的次数
        if(s.length() != t.length()) {
            return false;
        }
        int[] tab = new int [26];
        for (int i =0; i <s.length(); i++) {
            tab[s.charAt(i) - 'a']++;
        }
        for (int j =0; j <t.length(); j++) {
            tab[t.charAt(j) - 'a']--;
            if( tab[t.charAt(j) - 'a'] <0) {
                return false;
            }
        }
        return true;
    }
}
